public class CD {
	int id;
	String title;
	double price;

	public CD(int id, String title, double price) {
		this.id = id;
		this.title = title;
		this.price = price;
	}
	
	@Override
	public String toString() {
		String output = "ID: " + id + "\t" +
			"Title: " + title + "\t" + 
			"Price: " + price + "\t";
		return output;
	}
}

