package cap7;

public class FrazioneE {
	
	FrazioneE(int n, int d) throws Exception{
		if (d ==0 )
			throw new Exception("denominatore nullo");
		///...
	} 
	
	
	public static void main(String[] args) throws Exception {
		FrazioneE f = new FrazioneE(4,5);
	}

}
