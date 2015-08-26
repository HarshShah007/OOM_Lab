public class Test {

	public static void main(String[] args) {

		Circle circle = new Circle(2.0, "Circle");
		System.out.println(circle.getName() + " " + circle.getArea());
		
		Square square = new Square(2.0, "Square");
		System.out.println(square.getName() + " " + square.getArea());

		Cylinder cylinder = new Cylinder(2.0, 2.0, "Cylinder");
		System.out.println(cylinder.getName() + " " + cylinder.getVolume());

		Sphere sphere = new Sphere(2.0, "Sphere");
		System.out.println(sphere.getName() + " " + sphere.getVolume());

		Cube cube = new Cube(2.0, "Cube");
		System.out.println(cube.getName() + " " + cube.getVolume());

		Glome glome = new Glome(2.0, "Glome");
		System.out.println(glome.getName() + " " + glome.getVolume());

	}
}

