package main;

public class Triangle extends GeometricObject {

	private double side1 = 1.0;
	private double side2 = 1.0;
	private double side3 = 1.0;
	
	public Triangle(){

	}
	/** Create new Triangle given three sides
	 * 
	 * @param side1
	 * @param side2
	 * @param side3
	 */
	public Triangle(double side1, double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	public double getSide2() {
		return side2;
	}

	public void setSide2(double side2) {
		this.side2 = side2;
	}

	public double getSide3() {
		return side3;
	}

	public void setSide3(double side3) {
		this.side3 = side3;
	}
	// returns Area of given triangle
	@Override
	public double getArea() {
		double p = getPerimeter() / 2;
		double s = p * ((p - side1) * (p - side2) * (p - side3));
		double Area = Math.sqrt(s);
		return Area;
	}
	// returns Perimeter of given triangle
	@Override
	public double getPerimeter() {
		return side1 + side2 + side3;
	}
	// creates string representation of given triangle
	public String toString() {
		return "Triangle with side1 = " +side1+ ", side2 = " +side2+ ", side3 = " +side3;
	}

}
