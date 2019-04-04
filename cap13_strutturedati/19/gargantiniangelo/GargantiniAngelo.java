package gargantiniangelo;

class Computer implements Comparable<Computer> {
	int costo;

	public Computer(int i) {costo = i;
	}

	@Override
	public int compareTo(Computer o) {
		return this.costo - o.costo;
	}

	@Override
	public String toString() {
		return "comp " + costo;
	}
}

class PilaComputer {

	class Nodo {
		Computer dato;
		Nodo prossimo;
	}

	Nodo cima = null;

	void push(Computer c) {
		Nodo newNodo = new Nodo();
		newNodo.dato = c;
		newNodo.prossimo = cima;
		cima = newNodo;
	}

	void print() {
		for (Nodo i = cima; i != null; i = i.prossimo) {
			System.out.println(i.dato);
		}
	}

	Computer pop() {
		Computer dato = cima.dato;
		cima = cima.prossimo;
		return dato;
	}

	// cerca un elemento con il costo dato
	boolean find(int costo) {
		for (Nodo i = cima; i != null; i = i.prossimo) {
			if (i.dato.costo == costo)
				return true;
		}
		return false;
	}
}

public class GargantiniAngelo {
	public static void main(String[] args) {
		PilaComputer pc = new PilaComputer();
		pc.push( new Computer(1000));
		pc.print();
		pc.push( new Computer(500));
		pc.print();
	}
}