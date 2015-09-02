import java.util.*;

public class SoftwareEngineer extends Employee {

	public SoftwareEngineer() {
		super();
	}

	public SoftwareEngineer(String empName, int empId) {
		super(empName, empId);
	}

	public boolean work() {
		System.out.println("This object represents Software Engineer");
		Random crisisGen = new Random();
		if (crisisGen.nextInt(10) == 0) {
			System.out.println("Its a crisis");
			return false;
		} else {
			System.out.println("I am programming.");
			return true;
		}
	}

	public String toString() {
		return "Software Engineer " + super.toString();
	}
}

