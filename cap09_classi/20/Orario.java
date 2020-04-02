import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

public class Orario {
	// campi costanti
	// private static final String SEPARATORE = ":";
	// campo static non costante
	private static String SEPARATORE = ":";
	
	private byte ore;
	private byte minuti;
	
	public Orario(int ore, int min) {
		this.ore = (byte) ore;
		this.minuti = (byte) min;
	}
	// in formato HH:MM 
	public Orario(String s) {
		this(Integer.parseInt(s.split(":")[0]),
				Integer.parseInt(s.split(":")[1]));
	}
	public String toString() {
		return ore + SEPARATORE + minuti;
	}	
	
	public static void setSeparatore(char c) {
		SEPARATORE = Character.toString(c);
	}
	
	
	public static void main(String[] args) {
		//Orario o = new Orario();// se definisco miei costruttori questo non c'� pi�
		//Orario o2 = new Orario();
		Orario o = new Orario(12,50);
		System.out.println(o);
		//o.SEPARATORE = "-"; //ok ma scosigliato
		Orario.SEPARATORE = "-";	
		System.out.println(o);
		//System.out.println(o2);		
		System.out.println(new Orario("12:50"));
		Orario.setSeparatore('/');
		System.out.println(new Orario("12:50"));
	}	
}
/*class A{
	Orario o = new Orario();
	public String toString() {
		//System.out.println(o.ore);
	}
}*/

