public class Test {

	public static void main(String[] args) {

		Rectangle rect = new Rectangle(2.0, 3.0);
		System.out.println("New rectangle object");

		System.out.println("Perimeter is " + rect.getPerimeter());
		System.out.println("Area is " + rect.getArea());

		Circle circle = new Circle(1.0);
		System.out.println("New Circle object");

		System.out.println("Perimeter is " + circle.getPerimeter());
		System.out.println("Area is " + circle.getArea());
		System.out.println("Circumference is " + circle.getCircumference());
	}
}

