package cap10;

// costruttore private e singleton
class DBConnection{
	
	public static DBConnection instance = new DBConnection(;)
	
	private DBConnection(){
		// operazioni critiche
	}
}

public class CostruttorePrivate {

	public static void main(String[] args) {
		//DBConnection dbc = new DBConnection();
		DBConnection dbc = DBConnection.instance;
	}
	
}
