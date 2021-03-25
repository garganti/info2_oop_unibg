
public class Frazione {
	// CAMPI
	
//Stato interno
	private long num; // private: non visibile all'esterno della classe
	private long den;

// COSTRUTTORI
//Overload 
	public Frazione(long num, long den) {//con due parametri
        System.out.print("sto creando la frazione");
        this.num = num; // this num--> num definito
		this.den = den; // den --> ricevuto come parametro
	}	
    /*public Frazione(long num){//con un solo parametro
        this.num=num;
        this.den=1;
    }*/
	public Frazione(long num){
		this(num,1); // equivale a chiamare il costruttore
					// Frazione(num,1)
	}
    public Frazione(){//senza parametri  
        this(0);//Frazione con un campo,deve stare al inizio
    }

    // METODO
    public Frazione per(Frazione a){
    	long nuovoNum = a.num * this.num;
    	long nuovoDen = a.den * this.den;    	
    	Frazione per = new Frazione(nuovoNum, nuovoDen);    	
    	return per;    	
    	//
    	// return new Frazione(a.num*this.de ...)
    }
    
    public Frazione piu(Frazione a){
    	long n = this.num * a.den + this.den * a.num;
    	long d = this.den * a.den;
    	// semplifico
    	// tra il massimo comun divisore tra n e d
    	long m = mcd(n,d);
    	return new Frazione(n/m,d/m);
    }
    // restuisce il massimo comun divisore tra a e b	
    static public long mcd(long a, long b) {
    	//
    	return 0;
    }
    
    public static void main(String[] args) {
		System.out.println(mcd(6,3));
	}

}