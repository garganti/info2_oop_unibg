package cap13_strutturedati.proveB;

import java.util.ArrayList;
import java.util.List;

import prog.io.FileInputManager;

class Studente{}
class Studente1L extends Studente{

	public Studente1L(String string, String string2) {
		// TODO Auto-generated constructor stub
	}}
class StudenteLM extends Studente{

	public StudenteLM(String string, String string2) {
		// TODO Auto-generated constructor stub
	}}

public class LeggiStudenti {

	public static void main(String[] args) {
		try {
			System.out.println(leggiDaFile());
		} catch (StudenteNonRicnosciutoCon e) {
			// TODO Auto-generated catch block
			System.out.println("QUALCOSA non è andato bene");
		}
	}
	
	static List<Studente> leggiDaFile() throws StudenteNonRicnosciutoCon{
		FileInputManager file = new FileInputManager("studenti.txt");
		List<Studente> result = new ArrayList<>();
		for(;;){
			String line = file.readLine();
			if (line == null) break;
			String[] data = line.split(":");
			if (data[0].equals("LM")){
				result.add(new StudenteLM(data[1],data[2]));
			} else if (data[0].equals("L1L")){
				result.add(new Studente1L(data[1],data[2]));				
			} else{
				//1. ecc non controllata delle liberia
				//throw new RuntimeException("stduete non ricnosciuto");
				// 2. ecc non controllata mia
				//throw new StudenteNonRicnosciuto();
				// 3 ecc controllata mia
				throw new StudenteNonRicnosciutoCon();
			}
		}
		return result;
	}
	
	
}
