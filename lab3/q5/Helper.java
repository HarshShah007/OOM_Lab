import java.io.*;

public class Helper {

	public static String getInput(String prompt) {
		System.out.print(prompt);
		String input = null;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
		} catch (IOException iex) {
			iex.printStackTrace();
		}
		return input;
	}

	public static double computeSubtotal(int quantity, double price) {
		return quantity * price;
	}

	public static double computeTotal(double subTotal, double tax) {
		return subTotal + subTotal * tax / 100;
	}
}

