package labSheet;

public class Temperature {

	//instance var
	private double f;
	
	
	public void setFahrenheit(double f ) {
		this.f = f;
	}
	
	public double toCelsius() {
		return (f-32) * 5/9;
		
		
	}
}
