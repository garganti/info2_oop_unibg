package episodi;

public final class EpisodeLO extends Episode{

	String ling;
	
	public EpisodeLO(String t, String a, String ling){
		super(t,a);
		this.ling = ling;
		
	}
	@Override
	public String toString() {
		return super.toString() + "[" + ling + "]";
	}
	
	
	
}
