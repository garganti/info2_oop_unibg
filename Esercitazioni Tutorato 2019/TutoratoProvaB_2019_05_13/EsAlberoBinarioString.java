/** A possible solution of ProvaB - part A of july 2018
 * Author: Marco Radavelli
 */
public class EsAlberoBinarioString {
	public static void main(String[] args) {
		AlberoStringhe a = new AlberoStringhe();
		a.insert("a");
		a.insert("B");
		a.insert("c");
		a.insert("d");
		a.insert("Eeeee");
		System.out.println(a.printCrescente());
		System.out.println(a.printInverso());
		System.out.println(a.getPiuLunga());
	}
}

class AlberoStringhe {
	Nodo radice = null;
	
	public void insert(String s) {
		if (radice==null) radice = new Nodo(s);
		else insertRec(s, radice);
	}
	
	void insertRec(String s, Nodo n) {
		if (s.toLowerCase().compareTo(n.s)<0) {
			if (n.l==null) n.l = new Nodo(s);
			else insertRec(s, n.l);
		} else {
			if (n.r==null) n.r = new Nodo(s);
			else insertRec(s, n.r);
		}
	}
	
	/** equivalent to post order */
	public String printCrescente() {
		return print(radice, false);
	}
	
	/** equivalent to pre order */
	public String printInverso() {
		return print(radice, true);
	}
	
	public String getPiuLunga() {
		return getPiuLunga(radice);
	}
	
	private String getPiuLunga(Nodo n) {
		String mx = "";
		if (n.s!=null) {
			if (n.s.length()>mx.length()) mx=n.s;
		}
		if (n.l!=null) {
			String s = getPiuLunga(n.l);
			if (s.length()>mx.length()) mx=s;
		}
		if (n.r!=null) {
			String s = getPiuLunga(n.r);
			if (s.length()>mx.length()) mx=s;
		}
		return mx;
	}
	
	private String print(Nodo n, boolean inverso) {
		String s = "";
		if (n!=null) {
			Nodo n2 = inverso ? n.l : n.r;
			if (n2!=null) s+=print(n2, inverso)+" ";
			s+=n.s+" ";
			n2 = inverso ? n.r : n.l;
			if (n2!=null) s+=print(n2, inverso)+" ";
		}
		return s;
	}
}

class Nodo {
	String s;
	Nodo l, r;
	
	public Nodo(String s) {
		this.s = s;
	}
}
