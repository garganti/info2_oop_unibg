import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.Vector;

import prog.io.ConsoleInputManager;
import prog.io.ConsoleOutputManager;

public class Es13 {

	public static void main(String[] args) {
		ConsoleInputManager in = new ConsoleInputManager();
		ConsoleOutputManager out = new ConsoleOutputManager();
		String intput = in.readLine("Inserisci le sottostringhe separate da , : ");
		StringTokenizer st = new StringTokenizer(intput, ",");
		Vector<String> elencoStringhe = new Vector<>();
		while(st.hasMoreTokens()) {
			elencoStringhe.add(st.nextToken());
		}
		
		for (int i=elencoStringhe.size()-1; i>=0; i--)
			out.print(elencoStringhe.get(i));
		
	}

	
}
