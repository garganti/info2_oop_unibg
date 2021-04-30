package orario;

public class OraHM extends Ora{
	
	int ora;
	int minuti;
	
	public OraHM(int h, int m) {
		if (h<0 || h > 23 || m < 0 || m> 59)
			throw new RuntimeException("ora non valida");
		ora = h; minuti = m;
	}
	@Override
	public int getHH() {return ora;}

	@Override
	public int getMM() {return minuti;}
	
	@Override
	public String toString() {
		//return "OraHM["+ora + ":" + minuti + "]";
		return String.format("OraHM[%2d:%2d]",ora, minuti);
	}

}
