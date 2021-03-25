import java.util.Vector;

import prog.utili.Quadrato;
import prog.utili.Rettangolo;

public class SottoTipoArrays {

	public static void main(String[] args) {
		
		Rettangolo[] rrrr = new Rettangolo[10];
		Quadrato[] qqqq = new Quadrato[20];
		rrrr = qqqq;
		
		
		// non usando i generici
		Vector<Rettangolo> vr = new Vector<>();
		Vector<Quadrato> vq = new Vector<>();
		
		// 
		vr = vq;
	
		Object o;
		o = new String();
		
		Vector<String> nomi = new Vector<>();
		
		Vector<Object> oo = nomi;// NOOO
		// vector di qualsiasi cosa:
		Vector<?> vo;
		vo = nomi; // OK
		
		
		
	}
	
}
