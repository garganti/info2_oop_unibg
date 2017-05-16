package gestore;

import prog.io.FileInputManager;
import prog.utili.SequenzaOrdinata;
import telecamere.PosizioneOutOfBoundException;
import telecamere.Telecamera;
import telecamere.TelecameraAllarme;
import telecamere.TelecameraNormale;
import telecamere.TelecameraSemplice;

public class GestoreTelecamere {

	SequenzaOrdinata<Telecamera> telecamere;
	
	GestoreTelecamere(){
		telecamere = new SequenzaOrdinata<Telecamera>();
	}
	
	/** inserisci telecamera */
	void addTelecamera(Telecamera t){
		telecamere.add(t);		
	}
	/** stampa le telecamere in ordine di posizione */
	void stampa(){
		System.out.println("telecamere ");
		for(Telecamera t: telecamere){
			System.out.println(t.toString());
		}
	}
	/** opera sulle singole telecamere
	 * @return se l'operazione ha avuto successo (ha cambiato lo stato) */
	boolean opera(int ID, Operazione op){
		// converti in array per accesso con indice
		Telecamera[] tt = new Telecamera[telecamere.size()];
		int k = 0;
		for(Telecamera t: telecamere){
			tt[k++] = t;
		}
		// cerco nell'array
		for(int i = 0; i < tt.length; i++){
			Telecamera t = tt[i];
			if (t.getID() == ID) {
				// opera su questa telecamera
				switch (op) {
				case SPEGNIMENTO:
					// se quelle prima e dopo non lo sono
					if ( (i > 0 && i < tt.length-1 && tt[i-1].isAccesa() && tt[i+1].isAccesa()) 
							|| (i==0 && i<tt.length-1 && tt[i+1].isAccesa())  // caso estremo i=0
							|| (i==tt.length-1 && i>0 && tt[i-1].isAccesa())) // caso estremo i=length-1 (ultimo elemento)	
						return t.spegni();
					return false;
				case ACCENSIONE:
					return t.accendi();
				case BLOCCOIMMAGINE:
					return t.bloccoImmagine();
				default:
					break;
				}
				break;
			}
		}
		return false;
	}
	/** carica un nuovo generatore da file
	 ogni riga rappresenta una telecamera con questo formato
	 se è normale
	 N;descrizione;pos
	 se è allarmata
	 A;descrizione;pos;ntel
	 se è semplice
	 S;descrizione;pos;costruttore */
	static GestoreTelecamere caricaTelecamereDaFile(){
		GestoreTelecamere gt = new GestoreTelecamere();
		// file da cui leggere
		FileInputManager file = new FileInputManager("telecamere.txt");
		for(;;){
			String line = file.readLine();
			if (line == null) break;
			// faccio lo split
			String[] data = line.split(";");
			switch (data[0]) {
			case "A":
				try {
					gt.addTelecamera(new TelecameraAllarme(data[1], Float.parseFloat(data[2]), data[3]));
				} catch (PosizioneOutOfBoundException e) {System.err.println(e.getMessage());}
				break;
			case "N":
				try {
					gt.addTelecamera(new TelecameraNormale(data[1], Float.parseFloat(data[2])));
				} catch (PosizioneOutOfBoundException e) {System.err.println(e.getMessage());}
				break;
			case "S":
				try {
					gt.addTelecamera(new TelecameraSemplice(data[1], Float.parseFloat(data[2]), data[3]));
				} catch (PosizioneOutOfBoundException e) {System.err.println(e.getMessage());}
				break;
			default:
				break;
			}
		}
		return gt;
	}
}
