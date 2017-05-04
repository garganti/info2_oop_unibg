
class Data{
	int giorno, mese, anno;
	public Data(int i, int j, int k) {
		giorno =i; mese = j; anno = k;
	}
	@Override
	public boolean equals(Object o) {
		//if (this == o) return true;// opzionale
		if (o instanceof Data) {
			Data d = (Data) o;
			return this.giorno == d.giorno && this.mese == d.mese && this.anno == d.anno;
		} else {
			return false;
		}
	}
}


public class ProvaEquals {
	public static void main(String[] args) {
		Data d1 = new Data(3, 4, 2007);
		Data d2 = new Data(3, 4, 2007);
		System.out.println(d1.equals(d2));
		System.out.println(d1.equals("nondata"));		
	}

}
