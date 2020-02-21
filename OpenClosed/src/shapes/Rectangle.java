package shapes;

public class Rectangle extends Shape {
	//Area = w*h
	
	private int width;
	private int height;
	
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return height * width;
	}
}
