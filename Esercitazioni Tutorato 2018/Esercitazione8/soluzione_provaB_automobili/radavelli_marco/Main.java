package radavelli_marco;

public class Main {
	public static void main(String[] args) {
		Automobile audi = new Automobile(200000);
		Automobile bmw = new Automobile(250000);
		Automobile citroenDiGargantini = new Automobile(300000);
		
		Automobile[] v = new Automobile[] {audi, bmw, citroenDiGargantini};
		trovaAutoPiuVecchia(v);
	}
	
	public static Automobile trovaAutoPiuVecchia(Automobile[] v) {
		Automobile piuVecchia = null;
		if (v.length>0) {
			int pMin = 0;
			for (int i=1; i<v.length; i++) 
				if (v[i].km > v[pMin].km) pMin = i;
			piuVecchia = v[pMin];
		}
		System.out.println(piuVecchia);
		return piuVecchia;
	}
	
}
