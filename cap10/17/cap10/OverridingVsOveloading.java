package cap10;
class K{
	void foo(int t){}
}
class H extends K{
	@Override
	//void foo(int l) {};
	void foo(double l) {};
}

class R{
	// OVERLOADING
	void hhhh(int h){}
	void hhhh(int j, String s){}
}

class Q{
	void lung(int h){}
}

class D extends Q{
	void lung(int h){} // OVERRIDING
	void lung(String s){} // OVERLOADING
	
}


public class OverridingVsOveloading {

}
