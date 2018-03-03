package episodi;

public class Episode {
	
	private String titolo;
	protected String trama;
	public Episode nextEpisode;
	
	public Episode(String titolo, String trama){
		this.titolo = titolo;
		this.trama = trama;
	}
	
    public void setNext(Episode e){
		nextEpisode = e;
	}
	
	
	
	// due episodi sono ugauli se hanno lo stesso titolo 
	// ignorando maiuscolo/minuscolo
	@Override
	public boolean equals(Object o){
		// confrontare thi s e o, e vedere se sono lo stesso espisodio
		if (o instanceof Episode){
			Episode oe = (Episode) o;
			return this.titolo.equalsIgnoreCase(oe.titolo);
		} else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return titolo;
	}
	
}
