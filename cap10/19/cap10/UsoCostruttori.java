package cap10;

class A1{}
// equivalente (tradotto in)
class A2{ A2(){}}

class B1 extends A1{ B1(){}}
// equivalente (tradotto in)
class B2 extends A1{ B2(){super();}}

class C { C(int c){}}
class D extends C{ D(){}}
class D2 extends C{ D2(){super();}}

public class UsoCostruttori {

}
