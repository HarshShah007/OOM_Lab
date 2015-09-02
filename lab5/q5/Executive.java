public class Executive extends Employee implements Manager {

	public Executive() {
		super();
	}

	public Executive(String name, int id) {
		super(name, id);
	}

	public boolean work() {
		System.out.println("This is Executive");
		System.out.println("Playing golf");
		return true;
	}

	public void handleCrisis() {
		System.out.println("Handling crisis of Software Manager");
	}

	@Override
	public String toString() {
		return "Executive " + super.toString();
	}
}
