public class Cube extends Square implements Volume {

	public Cube(double side, String name) {
		super(side, name);
	}

	public double getVolume() {
		return side * side * side;
	}
}
