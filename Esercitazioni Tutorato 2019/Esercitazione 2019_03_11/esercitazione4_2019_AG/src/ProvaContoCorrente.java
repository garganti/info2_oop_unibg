
public class ProvaContoCorrente {

	public static void main(String[] args) {
		ContoCorrente mioContoCorrente = 
				new ContoCorrente(1, "angelo", 1000000000);
		System.out.println(mioContoCorrente.toString());

		mioContoCorrente.preleva(1000);
		mioContoCorrente.versa(2000);
		System.out.println(mioContoCorrente);
		// 
		ContoCorrente cc2 = 
				new ContoCorrente(2, "paolo", -10);
		//
		ContoCorrente cc3 = 
				new ContoCorrente(3, "piero", 100);
		System.out.println(cc3);
		cc3.preleva(200);
		System.out.println(cc3);
		// conto corrente con importo di defautl
		ContoCorrente cc0 = new ContoCorrente(4, "gio");
		System.out.println(cc0);
		// 
		ContoCorrente ccnew = new ContoCorrente("alberto");
		System.out.println(ccnew);
	}

}
