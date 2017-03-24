package cap7;

public class UsoFinally {
	public static void main(String[] args) {
		leggiDatiDaDb();
	}

	private static void leggiDatiDaDb() {
		System.out.println("open connection");
		
		try{
			System.out.println("leggi dati");
			int j = 9/(int)(Math.random()*2.0);
		} catch(Exception e){
			
		} catch(RuntimeException e){
			
		} finally {
			System.out.println("close connection");			
		}
		
		
	}

}
