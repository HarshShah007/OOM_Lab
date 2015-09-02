import java.util.*;

public class SoftwareManager extends SoftwareEngineer implements Manager {

	public SoftwareManager() {
		super();
	}

	public SoftwareManager(String name, int id) {
		super(name, id);
	}

	@Override
	public boolean work() {
		System.out.println("This is Software Manager");
		Random crisisGen = new Random();
		if (crisisGen.nextInt(10) == 0) {
			System.out.println("Its a crisis");
			return false;
		} else {
			System.out.println("I am programming.");
			return true;
		}
	}

	public void handleCrisis() {
		System.out.println("Handling a crisis of Software Engineer");
	}

	@Override
	public String toString() {
		return "Software Manager " + super.toString();
	}
}
