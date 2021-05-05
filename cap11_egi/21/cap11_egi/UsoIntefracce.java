package cap11_egi;
interface I {
	int i();
}
class A implements I{
	@Override
	public int i() {return 0;}	
}

interface I2{  void foo();}
interface I3{  void bar();}

class B extends A implements I2, I3{

	@Override
	public void bar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void foo() {
		// TODO Auto-generated method stub
		
	}
	
}

public class UsoIntefracce {
	
	public static void main(String[] args) {
		I3 i3 = new B(); 
		i3.bar();
	}

}
