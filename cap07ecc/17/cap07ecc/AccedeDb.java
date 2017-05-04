package cap07ecc;

public class AccedeDb {

	public static void main(String[] args) {
		try {
			initDB();
			readFromDB();
		} catch (Exception e) {
		} finally {
			closeDB();
		}
	}

	private static void closeDB() {
		System.out.println("closeDB");
	}

	private static void readFromDB() {
		System.out.println("leggi db");
		//int h = 7/0;
	}

	private static void initDB() {
		System.out.println("apri DB");
	}

}
