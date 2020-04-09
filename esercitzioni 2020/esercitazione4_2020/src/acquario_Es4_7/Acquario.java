package acquario_Es4_7;

import java.util.ArrayList;
import java.util.List;

public class Acquario {

	List<Vasca> vasche = new ArrayList<>();

	public void addVasca(Vasca v) {
		vasche.add(v);
	}

	@Override
	public String toString() {
		String result = "";
		for (Vasca v : vasche) {
			result += v.toString() + "\n";
		}
		return result;
	}

}
