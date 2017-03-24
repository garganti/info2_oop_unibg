import sudoku.SudokuBoard;


public class ProvaSudoku {

	public static void main(String[] args) {
		SudokuBoard s = new SudokuBoard();
		// empty
		System.out.println(s.toString());
		s.setNumber(1, 0, 0);
		System.out.println(s.isPossibile(1, 0, 0));
		System.out.println(s.isPossibile(1, 2, 0));
		System.out.println(s.isPossibile(1, 1, 1));
		System.out.println(s.isPossibile(1, 5, 0));
		System.out.println(s.toString());
		
	}
	
}
