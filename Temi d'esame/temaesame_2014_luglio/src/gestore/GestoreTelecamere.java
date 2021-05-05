package gestore;

import prog.io.FileInputManager;
import prog.utili.Sequenza;
import prog.utili.SequenzaOrdinata;
import telecamere.Telecamera;
import telecamere.TelecameraAllarme;
import telecamere.TelecameraNormale;

public class GestoreTelecamere {

	SequenzaOrdinata<Telecamera> teelcamere;
	
	GestoreTelecamere(){
		teelcamere = new SequenzaOrdinata<Telecamera>();
	}
	
	// inserisci telecamera
	void addTelecamera(Telecamera t){
		teelcamere.add(t);		
	}
	// stampa le telecamere in ordine di posizione
	void stampa(){
		System.out.println("telecamere ");
		for(Telecamera t: teelcamere){
			System.out.println(t.toString());
		}
	}
	// opera sull singole telecamere
	void opera(int ID, Operazione op){
		// converti in array per accesso con indice
		Telecamera[] tt = new Telecamera[teelcamere.size()];
		int k = 0;
		for(Telecamera t: teelcamere){
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
					if (i > 0 && i < tt.length-1 && 
							tt[i-1].isAccesa() && tt[i+1].isAccesa())						
						t.spegni();
					// TODO mettere anche i casi estremi (i = 0 e i = length -1)
					break;
				case ACCENSIONE:
					t.accendi();
					break;
				case BLOCCOIMMAGINE:
					t.bloccoImmagine();
				default:
					break;
				}
				break;
			}
		}
		
	}
	// carica un nuovo generatore da file
	// ogni riga rappresenta una telecamera conq uesto formato
	// se è normale
	// N;descrizione;pos
	// se è allarmata
	// A;descrizione;pos;ntel
	// se è semplice
	// S;descrizione;pos;costruttore
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
				gt.addTelecamera(new TelecameraAllarme(data[1], Float.parseFloat(data[2]), data[3]));
				break;
			case "N":
				gt.addTelecamera(new TelecameraNormale(data[1], Float.parseFloat(data[2])));
			default:
				break;
			}
		}
		return gt;
	}
}
