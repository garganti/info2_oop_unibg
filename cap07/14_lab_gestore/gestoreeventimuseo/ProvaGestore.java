package gestoreeventimuseo;

public class ProvaGestore {

	public static void main(String[] args) {
		// creo un gestore
		GestoreEventiMuseo gem = new GestoreEventiMuseo("accademia carrara");
		// evento nel passato --> errore
		gem.insertEvento("mosta picasso", "10.1.2014", "10.5.2015", "s1,s2,s3,s4");
		// evento con date sbagliate --> errore
		gem.insertEvento("mosta picasso", "10.1.2015", "10.5.2014", "s1,s2,s3,s4");
		// evento corretto
		gem.insertEvento("mosta picasso", "10.1.2015", "10.5.2015", "s1,s2,s3,s4");
		// evento che usa le stesse sale
		gem.insertEvento("concerto", "1.5.2015", "2.5.2015", "s1");
		// provo a stampare
		gem.stampaEventi();
		
		
		
	}

}
