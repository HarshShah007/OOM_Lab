public class Test {

	public static void main(String[] args) {

		Rectangle rectangle = new Rectangle();
		System.out.println("Instaniated rectangle object");

		rectangle.draw();
		rectangle.moveTo(5, 4);

		Circle circle = new Circle();
		System.out.println("Instantiated circle object");
		
		circle.draw();
		circle.moveTo(2, 3);
	}
}
