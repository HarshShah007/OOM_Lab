public class Test {

	public static void main(String[] args) {

		Deer deer = new Deer();
		System.out.println("Created new deer object");

		deer.sound = "moo";
		System.out.println(deer.getSound());

		deer.eatGrass();

		System.out.println(deer.getBehavior());
		System.out.println(deer.getThingType());

		Cat cat = new Cat();
		System.out.println("Created cat object");
		
		cat.sound = "mew";
		System.out.println(cat.getSound());

		System.out.println(cat.getBehavior());
		System.out.println(cat.getThingType());

		Chick chick = new Chick();
		System.out.println("Created chick object");
		
		chick.sound = "cluck";
		System.out.println(chick.getSound());

		System.out.println(chick.getBehavior());
		System.out.println(chick.getThingType());
	}
}


