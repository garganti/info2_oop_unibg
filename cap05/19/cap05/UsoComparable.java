package cap05;

import prog.utili.SequenzaOrdinata;

public class UsoComparable {

	public static void main(String[] args) {
		String s = "pippo";
		System.out.println(s.compareTo("pluto"));
		System.out.println(s.compareTo("pippo"));
		System.out.println(s.compareTo("aaa"));
		
		SequenzaOrdinata<String> nomi = new SequenzaOrdinata<String>();
		nomi.add("ZZZ");
		nomi.add("AAA");
		nomi.add("EEE");
		nomi.add("aaa");
		System.out.println(nomi);
		
		Comparable<String> i = new String("ooo");
		
		//i.compareTo(o)
		
		
	}

}
