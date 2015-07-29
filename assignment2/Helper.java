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
}
