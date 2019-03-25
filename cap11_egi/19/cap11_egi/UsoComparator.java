package cap11_egi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Country implements Comparable<Country>{
	String name;
	float area;
	float popolazione;
	Country(String n, float a, float p){
		name = n; area = a; popolazione = p;
	}
	@Override
	public String toString() {
		return name  + " : " + area;
	}
	@Override
	public int compareTo(Country o) {
		return new Float(this.area).compareTo(new Float(o.area));
	}
}

class ComparatorByPopulation implements Comparator<Country>{

	@Override
	public int compare(Country o1, Country o2) {
		return Float.compare(o1.popolazione, o2.popolazione);
	}
	
}

public class UsoComparator {

	public static void main(String[] args) {
		List<Country> membriEU = new  ArrayList<>();
		membriEU.add(new Country("italia", 301000, 60));
		membriEU.add(new Country("francia", 641000, 70));
		membriEU.add(new Country("germania", 357000, 80));
		membriEU.add(new Country("spagna", 500000, 46));
		System.out.println(membriEU);
		// ordinamento
		Collections.sort(membriEU);
		System.out.println(membriEU);	
		// altro ordinamento rispetto popolazione
		Collections.sort(membriEU, new ComparatorByPopulation());
		System.out.println(membriEU);				
	}
	
}
