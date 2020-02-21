package shapes;

public class Trapezium extends Shape {
	//Area = ((b+t)/2) * h
	
	private int base;
	private int top;
	private int height;
	
	public Trapezium(int base, int top, int height){
		this.base = base;
		this.top = top;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return ((base + top) / 2.0f) * height;
	}
}
