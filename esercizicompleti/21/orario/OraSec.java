package orario;
/*Ora sfruttando una sola variabile 
di istanza di tipo int per memorizzare i secondi trascorsi 
nella giornata (da 0 a 86399, estremi inclusi)*/
public class OraSec extends Ora{
	
	private static final int SEC_IN_ORA = 3600;
	private int sec;

	public OraSec(int sec) {
		if (sec < 0 || sec >86399 )  throw new RuntimeException();
		this.sec = sec;
	}

	@Override
	public int getHH() {return sec/ SEC_IN_ORA;}

	@Override
	public int getMM() {return (sec%SEC_IN_ORA)/60;}
	
	@Override
	public String toString() {
		return String.format("OraSec[%2d:%2d]",getHH(), getMM());
	}

}
