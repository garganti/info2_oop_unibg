package cap11_egi;

interface I0{}

interface I extends I0{}

public interface Window extends I{	
	
	static int y = 90;
	
	void apri();

}

abstract class MyWindow implements Window{
	
}