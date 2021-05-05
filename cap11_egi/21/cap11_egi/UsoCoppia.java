package cap11_egi;

class Coppia<T,S>{ // T e S completamente generici
	T primo;
	S secondo;
}


public class UsoCoppia {

	public static void main(String[] args) {
		Coppia<String,Integer> c; //-> T <- String, S <- Integer
		c =new Coppia<String,Integer>();
		c.primo = "4";
	}
	
}
