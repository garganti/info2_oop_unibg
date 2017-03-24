package serietv;

public class Episode {

	private String title;
	private String story;
	private Episode next;

	public Episode(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}

	// due episode sono uguali se hanno stesso titolo (ignora case)
	// e stesso prossimo episodio
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Episode) {
			Episode e2 = (Episode) obj;
			if (this.title.equalsIgnoreCase(e2.title)
					&& ((this.next == null && e2.next == null) ||
							(this.next != null && e2.next != null 
							&& this.next.equals(e2.next))))
				return true;
			else
				return false;
		} else
			return false;
	}

	public void setNext(Episode e2) {
		next = e2;
	}

	public Episode getNext() {
		return next;
	}

}
