public class Patient extends Person {

	String patientNumber;
	String hospital;
	String yearOfJoining;
	Money fees;

	public Patient(String name, String address, String patientNumber, String hospital, String yearOfJoining) {
		super(name, address);
		this.patientNumber = patientNumber;
		this.hospital = hospital;
		this.yearOfJoining = yearOfJoining;
	}

	public String getHospital() {
		return hospital;
	}

	public void setHospital(String newHospital) {
		hospital = newHospital;
	}

	public Money calculateFees() {
		Money feesRequired = new Money(123050);
		this.fees = feesRequired;
		return feesRequired;
	}
}



