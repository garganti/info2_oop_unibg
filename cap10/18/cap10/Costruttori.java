package cap10;

class K{   K(int c){}}
// usa sempre super() nel costruttore di una sottoclasse
class L extends K { L(){ super(3); /*.... */}}

// eccezione 1. un costruttore chiama this
class M extends K {
	M(){this('o');}
	M(char t){super(8);}
}
// eccezione 2 .la superclasse ha un costruttore vuoto
class H { H(){}}
class N extends H {N(){}} 
// trasformato dal compilatore in
//class N extends H {N(){super();}} 
// per questo da errore
//class Z extends K { Z(){}}
//class Z extends K {}
class Q extends M{}

public class Costruttori {

}
