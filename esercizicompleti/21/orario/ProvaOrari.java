package orario;

import java.util.Collections;
import java.util.Vector;

public class ProvaOrari {

	public static void main(String[] args) {
		Ora now = new OraHM(10, 30);
		System.out.println(now);
		Ora mezzanotte = new OraHM(0, 0);
		System.out.println(mezzanotte);
		// 
		Ora now2 = new OraSec((10*60 + 40) *60);
		System.out.println(now2);
		//
		Vector<Ora> ore = new Vector<>();
		ore.add(now);
		ore.add(mezzanotte);
		ore.add(now2);
		System.out.println(ore);
		Collections.sort(ore);
		System.out.println(ore);
	}
}
