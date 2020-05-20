package cap11_egi;

public class MetodiGenerici {
	
	
	// prende in inresso un oggetto e restituisce la stringa ripetuta deu vole
	// 1 -> "11"
	// "aoo" -> "aooaoo"
	static <E> String duobleString(E obj) {
		return obj.toString() + obj.toString();
	}

}
