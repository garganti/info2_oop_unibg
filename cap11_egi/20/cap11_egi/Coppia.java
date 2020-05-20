package cap11_egi;

public class Coppia<TS,TD> {
	TS sinistro;
	TD destro;
	
	Coppia(TS sin, TD dex){
		sinistro = sin;
		destro = dex;
	}
	
	TS getsinistro(){
		return sinistro;
	}

	@Override
	public String toString() {
		return "<"+sinistro.toString() + ", "+destro.toString()+">";
	} 
	
	
	public static void main(String[] args) {
		Coppia<String,String> nc = new Coppia<String, String>("Mario","Rossi");
		System.out.println(nc);
		
		Coppia<String,Integer> ac = new Coppia<String, Integer>("porsche",5000);
		
		
		
	}
	
	
}
