package auto;
import prog.utili.Data;

/** automobili**/
abstract public class Auto {
	
	 protected String targa;
	 protected Data di;
	 
	 protected Auto(String t, Data d){
		 // controllo della targa
		 if (t.length() !=7){
			 throw new TargaNonValidaException();
		 }
		 targa = t;
		 di = d;
	 }

	 @Override
	public String toString() {
		 return targa;
	}
}
