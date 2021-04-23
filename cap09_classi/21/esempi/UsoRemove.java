package esempi;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class UsoRemove {
public static void main(String[] args) {
	Vector<String> names = new Vector<>(Arrays.asList("A","B","C"));
	for (int i = 0; i < names.size(); i++) {
		String n = names.get(i);
		if (n.equals("B"))
			names.remove(i);
	}
	System.out.println(names);
}
}
