public class TestPatient {

	public static void main(String[] args) {

		Patient newPatient = new Patient("Name", "Address", "Patient Number", "Hospital", "Year of Joining");
	       System.out.println("Name: " + newPatient.name);
	       System.out.println("Address: " + newPatient.address);

	       System.out.println("Fees recieved: " + newPatient.calculateFees().amount);

	       System.out.println("Fees to be paid: " + newPatient.fees.amount);
	}
}

