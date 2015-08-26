import java.util.*;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Shop {
	ArrayList<Transaction> history = new ArrayList<Transaction>();
	double tax = 6.25;
	int id = 1;

	public void purchase() {
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		int id = Integer.parseInt(Helper.getInput("Enter ID: "));
		String title = Helper.getInput("Enter Title: ");
		double price = Double.parseDouble(Helper.getInput("Enter price: "));

		CD newCD = new CD(id, title, price);
		int quantity = Integer.parseInt(Helper.getInput("Enter quantity: "));
		double subTotal = Helper.computeSubtotal(quantity, price);
		System.out.println("Subtotal: " + subTotal);
		double total = Helper.computeTotal(subTotal, tax);
		System.out.println("Total: " + total);
		history.add(new Transaction(this.id, newCD, quantity, total,  df.format(Calendar.getInstance().getTime())));
		this.id += 1;
	}

	public void showHistory() {
		System.out.println("");
		System.out.println("------------------All transactions history---------------");
		for (Transaction it : history) {
			System.out.println(it);
			System.out.println("");
		}
	}
}
