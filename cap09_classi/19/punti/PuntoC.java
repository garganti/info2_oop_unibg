
package punti;

public class PuntoC{
	
	private double x;
	private double y;
	
	public PuntoC(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	double getX(){
		return x;
	}
	double getY(){
		return y;
	}
	double getR() {
		return Math.sqrt(x*x + y*y);
	}
	
	double getTheta() {
		// TODO gestisci il caso in cui x è 0 e/o y è 0
		return Math.atan(y/x);
	}
	
	
}
