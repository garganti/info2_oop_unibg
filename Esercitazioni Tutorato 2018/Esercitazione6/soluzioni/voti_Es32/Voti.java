package voti_Es32;

import java.util.Arrays;

public class Voti {
	public static void main(String[] args) {
		try {
			// Normale funzionamento
			System.out.println(Arrays.toString(new Voti().getAvgAndMax("a;18;30;24")));
			
			// Eccezione
			System.out.println(Arrays.toString(new Voti().getAvgAndMax("16;-1;a;30;22")));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public double[] getAvgAndMax(String listOfGrades) throws Exception {
		String[] st = listOfGrades.split(";");
		int[] grades = new int[st.length];
		int sum = 0;
		int count = 0;
		for (int i=0; i<st.length; i++) {
			try {
				grades[i] = Integer.parseInt(st[i]);
			} catch (Exception e) {
				System.out.println("Ignorato voto "+st[i]+" in quanto non un numero.");
				continue;
			}
			if (grades[i]<0 || grades[i]>30) throw new Exception("Voto non valido: "+grades[i]);
			sum+=grades[i];
			count++;

		}
		return new double[] { (double)sum/count, sum };
	}
}
