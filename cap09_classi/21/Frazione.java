
public class Frazione {
	// CAMPI
	
//Stato interno
	private long num; // private: non visibile all'esterno della classe
	private long den;

// COSTRUTTORI
//Overload 
	public Frazione(long num, long den) {//con due parametri
        //System.out.print("sto creando la frazione");
    	// semplifico
    	// tra il massimo comun divisore tra n e d
    	long m = mcd(num,den);
        this.num = num/m; // this num--> num definito
		this.den = den/m; // den --> ricevuto come parametro
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
    	return new Frazione(n,d);
    }
    // restuisce il massimo comun divisore tra a e b	
    static public long mcd(long a, long b) {
    	//
    	long resto;
    	do {
    		resto = a%b;
    		a = b;
    		b = resto;
    	} while(resto!=0);
    	return a;
    }
    // toString
    @Override
    public String toString() {
    	return num + "/" + den;
    }
    
    @Override
    public boolean equals(Object obj) {
    	// fissata - > oveeriding del metodo di object
    	// se sono identici, sono sicuramente equals
    	if (this == obj) return true;
    	if (obj instanceof Frazione) {
    		Frazione f = (Frazione) obj;
    		return this.num == f.num && this.den == f.den;
    		//return equals((Frazione)obj)
    	}
    	return false;
    }
    
    /**
     * Equals.
     *
     * @param f the f
     * @return true, if successful
     */
    // qui sono più libero
    public boolean equals(Frazione f) {
    	// grazie alla semplificazione posso confrontare semplicemente
    	// i nume e den se conso uguali tra loro
    	/*if (this.num == f.num && this.den == f.den)
    		return true;
    	else
    		return false;*/
    	// oppure meglio:
    	//return this.num == f.num && this.den == f.den ? true : false;
    	// oppure ancora meglio:
    	return this.num == f.num && this.den == f.den; 
    }
    
    
    
    public static void main(String[] args) {
		System.out.println(Frazione.mcd(6,3));
		Frazione f1 = new Frazione(1, 2);
		System.out.println(f1.mcd(6,3));
		System.out.println(f1);
		Frazione f2 = new Frazione(10, 20);
		System.out.println(f2);
		
		System.out.println(f1.equals(f2));
		// segno
		Frazione f3 = new Frazione(1, 2);
		System.out.println(f3);
		Frazione f4 = new Frazione(-1,-2);
		System.out.println(f4);
		System.out.println(f3.equals(f4));
		
		
	}

}