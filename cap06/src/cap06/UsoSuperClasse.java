package cap06;

public class UsoSuperClasse {

	public static void main(String[] args) {
		Object o = new String("ciao");
		//
		Object uno;
		//
		if (Math.random() > 0.5){
			uno = new String("uno");
		} else{
			uno = new Integer(1);
		}
		System.out.println(uno.toString());
		
	}
	
}
