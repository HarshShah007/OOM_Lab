public class Cylinder extends Circle implements Volume {

	double height;

	public Cylinder(double height, double radius, String name) {
		super(radius, name);
		this.height = height;
	}

	public double getVolume() {
		return Math.PI * radius * radius * height;
	}
}
