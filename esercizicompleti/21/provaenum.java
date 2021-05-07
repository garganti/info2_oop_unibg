enum Mese{
	GEN, FEB{
		@Override
		int numGiorni() {
			return 28;
		}
	};
	int numGiorni() {return 31;}		
}
public class provaenum {
	
	Object o = new Object() {
		public String toString() {
			return "ooo";
		}
	};

	public static void main(String[] args) {
		//Mese.values()
	}
}
