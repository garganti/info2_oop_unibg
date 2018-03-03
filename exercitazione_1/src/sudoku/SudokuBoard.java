package sudoku;

import java.util.ArrayList;
import java.util.List;

/**
 * Scrivi la classe SudokuBoard come 3x3 SudokuCell.
 * 
 */
public class SudokuBoard {

	SudokuCell[][] cells;

	public SudokuBoard() {
		cells = new SudokuCell[3][3];
		for (int i = 0; i <= 2; i++)
			for (int j = 0; j <= 2; j++)
				cells[i][j] = new SudokuCell();

	}

	/**
	 * 
	 * @param n   numero da inserire
	 * @param x   la x (da 0 a 8 )
	 * @param y   la y (da 0 a 8 )
	 */

	public boolean isPossibile(int n, int x, int y) {
		// calcola le nuove coordinate:
		int cellNX = x/3;
		int	cellNY = y/3;
		//  calcola le coocrdinate interne
		int xpos = x%3;
		int ypos = y%3;
		// check if the cell is ok
		if (! cells[cellNX][cellNY].isPossibile(n, xpos, ypos)) 
			return false;
		// in ogni caso controlla che il numero non si già presente su tutte le celle con uguale riga e colonna
		// righe
		for (int ix = 0; ix <= 8; ix++)
			if (getNumber(ix,y) == n) return false;
		// colonne
		for (int iy = 0; iy <= 8; iy++)
			if (getNumber(x,iy) == n) return false;
		// ok il numero non è già presente
		return true;
		
	}
	
	
	private int getNumber(int x, int y){
		return cells[x/3][y/3].cells[x%3][y%3];
	}
	
	
	public void setNumber(int n, int x, int y){
		cells[x/3][y/3].cells[x%3][y%3] = n;
	}


	/**
	 * Scrivi il metodo numeriPossibile che restituisce i numeri che posso
	 * mettere in una casella.
	 */
	List<Integer> numeriPossibili(int x, int y) {
		List<Integer> result = new ArrayList<>(9);
		for( int n = 1; n <= 9; n ++){
			if (isPossibile(n, x, y)){
				result.add(n);
			}
		}
		return result;
	}
	
	
	@Override
	public String toString() {
		String result = "---------------------\n";
		for (int i = 0; i <= 2; i++){
			for (int j = 0; j <= 2; j++){
				result += "|";
				for (int cx = 0; cx <= 2; cx++){
					for (int x = 0; x <= 2; x++){
						result += cells[cx][i].cells[x][j];
						result += "|";
					}
					result += "|";
				}
				result += "\n";
			}
			result += "----------------------\n";
		}
		return result;
	}
	

}
