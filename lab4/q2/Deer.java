public class Deer extends Animal implements Vegetarian, Thing {

	public void eatGrass() {
		System.out.println("Deer eating grass");
	}

	public String getBehavior() {
		String behavior = "Deer is wild. Not friendly with humans.";
		return behavior;
	}

	public String getThingType() {
		String type = "Deer type";
		return type;
	}
}

