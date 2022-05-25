package entities;

public class Rectangle {
	public double width, height;
	
	public double getArea() {
		return this.width * this.height;
	}
	
	public double getPerimeter() {
		return 2 * (this.height + this.width);
	}
	
	public double getDiagonal() {
		return Math.sqrt(width * width + height * height);
	}
}
