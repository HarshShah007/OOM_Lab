public class Square extends Shape implements Area {

	double side;

	public Square(double side, String name) {
		this.side = side;
		this.name = name;
	}

	public double getArea() {
		return side * side;
	}
}
