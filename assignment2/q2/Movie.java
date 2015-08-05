public class Movie {

	String name;
	String inventoryNumber;
	double price;
	boolean isRented;
	Customer rentedTo;
	String dueDate;
	int nonMovieItems;
	String type;

	public Movie(String name, String inventoryNumber, double price, String type) {
		this.name = name;
		this.inventoryNumber = inventoryNumber;
		this.isRented = false;
		this.rentedTo = null;
		this.dueDate = null;
		this.type = type;
		this.nonMovieItems = 0;
	}

	@Override
	public String toString() {
		String display = "Name: " + name + "\n" +
			"Inventory Number: " + inventoryNumber + "\n" +
			"Price: " + price + "\n" +
			"Non-movie item purchased: " + nonMovieItems + "\n";

		if (isRented) {
			display += "Rented to: " + rentedTo.phoneNumber + "\n" +
				"Due date: " + dueDate + "\n";
		} else {
			display += "Not rented\n";
		}
		return display;
	}
}
