package pratiche;

// rappresent i diversi gradi di pratiche di tribunale
// con relativo moltiplicatore di costo
public enum GradoGidizio {
	
	PRIMO(1), SECONDO(2), CASSAZIONE(3);

	int fattoreCosto;
	
	GradoGidizio(int i){
		fattoreCosto = i;
	}
}
