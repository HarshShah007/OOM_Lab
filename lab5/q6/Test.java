public class Test {
	public static void main(String[] args) {
		Liquid liquid = new Liquid();
		System.out.println("Liquid object, liquid reference");
		liquid.description();

		liquid = new Milk();
		System.out.println("Milk object, liquid reference");
		liquid.description();
		
		liquid = new Coffee();
		System.out.println("Coffee object, liquid reference");
		liquid.description();
	}
}
