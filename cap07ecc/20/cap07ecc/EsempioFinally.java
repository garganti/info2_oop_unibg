package cap07ecc;

public class EsempioFinally {

	public static void main(String[] args) {

		System.out.println("apre connessione");

		try {
			System.out.println("fa una operazione che può lanciare una ecc");
			int y = 5 / (int) (Math.random() * 5);

			System.out.println("faccio altre operazioni");

		} catch (Exception e) {
			System.out.println("eccezione!!!! ALLARME");
			return;
		} finally {
			System.out.println("chiude connessione");
		}

	}

}
