package serial;

import episodi.Episode;

public class Serial {

	private String nome;
	private Episode primo;

	public Serial(String n, Episode p) {
		nome = n;
		primo = p;
	}
	
	@Override
	public String toString() {
		String result = nome;
		Episode temp = primo;
		while (temp != null){
			result += "\n" + temp.toString();
			temp = temp.nextEpisode;
		}
		return result;
	}

}
