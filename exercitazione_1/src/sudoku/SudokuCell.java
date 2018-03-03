package sudoku;

/**
 * Scrivi una classe SudokuCell che rappresenta una 
 * singola casella 3x3 del sudoku.
 * 
 */
public class SudokuCell {

	// 0 vuol dire cella vuota
	// inizialmente tutte vuote
	int[][] cells = new int[3][3];

	/**
	 * Scrivi i metodi isPossible(int n, int x, int y): se il numero n può stare
	 * nella posizione x,y
	 * 
	 * @param n numero da inserire
	 * @param x la x (da 0,1,2)
	 * @param y la y (da 0,1,2)
	 */
	boolean isPossibile(int n, int x, int y) {
		// non è vuota?
		if (cells[x][y] != 0)
			return false;
		// se vuota deve essere un nuovo numero
		for (int i = 0; i <= 2; i++)
			for (int j = 0; j <= 2; j++)
				if (cells[i][j] == n)
					return false;
		// altrimenti n non è in nessuna casella della cella
		return true;
	}

	/**
	 * setNumero(int n, int x, int y): mette il numero n in posizione x,y assumo
	 * che si possa mettere (il client deve controllare prima)
	 */
	void setNumero(int n, int x, int y) {
		cells[x][y] = n;
	}
}
