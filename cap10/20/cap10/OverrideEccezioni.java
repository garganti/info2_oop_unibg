package cap10;

class A{
	void foo() throws IndexOutOfBoundsException, RuntimeException{}
}
//1. override senza cambiare nulla
class B extends A{
	void foo() throws IndexOutOfBoundsException, RuntimeException{}
}
//2. override con meno eccezione
class C extends A{
	void foo() throws IndexOutOfBoundsException{}
}
//3. override cun eccezione + particolare
class D extends A {
	void foo() throws ArrayIndexOutOfBoundsException{}
}
//4. NO override con eccezione + generale
class E extends A {
	void foo() throws Exception{}
}



public class OverrideEccezioni {

}
