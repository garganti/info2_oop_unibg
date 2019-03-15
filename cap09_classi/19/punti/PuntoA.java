
package punti;

public class PuntoA{
	
	private double r;
	private double theta;
	
	public PuntoA(double r, double theta) {
		this.r = r;
		this.theta = theta;
	}
	
	double getX(){
		return r * Math.cos(theta);
	}
	double getY(){
		return r* Math.sin(theta);
	}
	double getR() {
		return r;
	}
	
	double getTheta() {
		return theta;
	}
	
	
}
