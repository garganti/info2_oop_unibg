// esempio di come settare in modo univoco un ID
class Volo{
	private static int idNumero = 1;
	private static char idCarattere = 'A';
	private String id;
	Volo(){
		id = idNumero + ":" + idCarattere; 
		// incrementa i contatori per gli ID
		if (idCarattere == 'Z') {idCarattere = 'A'; idNumero++; System.out.println();}
		else idCarattere++;}
	public String toString() {return id;}
}
public class UsoIDAlfanumeri {
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			Volo p1 = new Volo();
			System.out.print(p1 + " ");
		}
	}

}
