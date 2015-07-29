public class CarSharer {
	String name;
	String address;
	String detailsOfJourney;
	String preferences;

	public CarSharer(String name, String address, String detailsOfJourney, String preferences) {
		this.name = name;
		this.address = address;
		this.detailsOfJourney = detailsOfJourney;
		this.preferences = preferences;
	}
	
	@Override
	public String toString() {
		String output = name + "\n" + address + "\n" + detailsOfJourney + "\n" + preferences;
		return output;
	}

}
	
