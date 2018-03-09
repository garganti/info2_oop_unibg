package cap06;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;
import prog.utili.Quadrato;
import prog.utili.Rettangolo;



// domanda base e altezza ad utente del rettangolo da creare
// calcola l'area e il perimetro del rettangolo
public class UsoRettangoloEQ {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		int b =in.readInt("inserisci base");
		int h = in.readInt("inserisci altezza");
		Rettangolo r;
		if (b == h){
			// voglio costruire un quadrato
			r = new Quadrato(b);
		} else{
			r = new Rettangolo(b, h);			
		}
		// stampo i dati del rettangolo
		out.println("area è " +r.getArea());
		out.println("perimetro è "+ r.getPerimetro());
		out.println("la base è "+r.getBase());
		out.println("la figura ha " + r.toString());
		out.println("la figura è un " + r.getClass().getSimpleName());
		// USO DI INSTANCE OF
		/*if (r instanceof Quadrato){
			out.println("è un quadrato");
		} else{
			out.println("è un rettangolo");			
		}*/
		// questo non va bene
		if (r instanceof Rettangolo){
			out.println("è un rettangolo");			
		} else{
			out.println("è un quadrato");
		}
		
	}
	
}
