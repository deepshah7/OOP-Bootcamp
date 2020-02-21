package shapes;

public class Square extends Shape {
	// Area = x^2
	
	private int sideLength;
	
	public Square(int sideLength){
		this.sideLength = sideLength;
	}
	
	@Override
	public double calculateArea() {
		return Math.pow(sideLength, 2);
	}
}
