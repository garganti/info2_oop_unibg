import javax.swing.colorchooser.ColorSelectionModel;
import javax.swing.colorchooser.DefaultColorSelectionModel;

import jdk.internal.vm.compiler.word.ComparableWord;
import prog.utili.Rettangolo;
import prog.utili.SequenzaOrdinata;

interface Editable{ void edit();}

class Studente implements Comparable<Studente>{

	
	@Override
	public int compareTo(Studente o) {
		return 0;
		Math.PI
	}
	
}


public class UsoSeqOrdinata {

	public static void main(String[] args) {
		SequenzaOrdinata<String> nomi  = new SequenzaOrdinata<String>();
		nomi.add("JOOJO");
		nomi.add("irene");
		nomi.add("ROBERTO");
		nomi.add("mattia");
		System.out.println(nomi);				
		//SequenzaOrdinata<Rettangolo> figure;
		SequenzaOrdinata<Studente> sss;
		
		Editable e;
		
		ColorSelectionModel cw = new DefaultColorSelectionModel();
		
		System.out.println("fabio".compareTo("giulia"));
		
		
		System.out.println(Integer.valueOf(10)
							.compareTo(Integer.valueOf(-78)));
		
	}
}
