public class Transaction {
	int id;
	CD cd;
	int quantity;
	String date;
	double total;

	public Transaction(int id, CD cd, int quantity, double total, String date) {
		this.id = id;
		this.cd = cd;
		this.quantity = quantity;
		this.date = date;
		this.total = total;
	}

	@Override
	public String toString() {
		String out = "TransactionID: " + id + "\n" +
			cd.toString() + 
			"Quantity: " + quantity + "\n" +
			"Total: " + total + "\n" +
			"Date: " + date + "\n";
		return out;
	}
}
