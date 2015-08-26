public class Cat extends Animal implements Thing {

	public String getBehavior() {
		String behavior = "Cat is very friendly with humans.";
		return behavior;
	}

	public String getThingType() {
		return "Cat type";
	}
}

