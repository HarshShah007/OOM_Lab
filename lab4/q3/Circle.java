
public class Circle extends Shape implements Area {

	double radius;

	public Circle(double radius, String name) {
		this.name = name;
		this.radius = radius;
	}

	public double getArea() {
		return Math.PI * radius * radius;
	}
}
