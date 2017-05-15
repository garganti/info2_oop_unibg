package cap11_egi;
// tipo generico
public class Tripla<A,B,C> {

	A x1; B x2; C x3;
	
	Tripla(A a,B b,C c){
		x1 = a; x2 = b; x3 = c;
	}
	
	@Override
	public String toString() {
		return "[" + x1.toString() + ","+ 
					x2.toString() + ","+x3.toString() + "]";
	}
	
	public static void main(String[] args) {
		Tripla<Integer, Long, String> t = new Tripla<>(4,80L,"pippo");
		/*t.x1 = 4;
		t.x2 = 80L;
		t.x3 = "pippo";*/
		System.out.println(t);
	}
}
// NOOOOOOOOOOOOOOOOOOOOOOO
// public class Tripla<String,Integer,Studente> {
