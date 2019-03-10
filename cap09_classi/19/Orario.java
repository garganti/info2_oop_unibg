
public class Orario {
	
	private static final String delimitier = ":";
	
	// campi
	private byte ore, min, sec;

	// costruttori
	public Orario(int ore, int min, int sec) {
		this.ore = (byte) (ore + (min/60));
		this.min = (byte) ((min % 60) + sec/60);
		this.sec = (byte) (sec % 60);
	}
	// prende la stringa hh:mm:ss
	public Orario(String s) {
		this(Integer.parseInt(s.split(delimitier)[0]),
				Integer.parseInt(s.split(delimitier)[1]),
						Integer.parseInt(s.split(delimitier)[2]));
	}
		
	// toString
	@Override
	public String toString() {
		return ore + delimitier 
				+ (min < 10 ? "0" + min : min) + delimitier 
				+ (sec < 10 ? "0" + sec : sec); 
	}
	// quanti secondi di differenza tra this e o
	int differenzaSec(Orario o) {
		return (o.sec-this.sec)+ (o.min-this.min)*60 + (o.ore-this.ore)* 3600;
	}
}
