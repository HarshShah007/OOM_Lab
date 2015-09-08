import java.io.*;
public class Test {


	public static void main(String[] args) {

		while (true) {

			int count = 0;
			int num = ((int)(Math.random() * 5)) + 1;

			for (int i = 0; i < num; ++i) {

				Problem problem = getProblem();

				problem.setNum1((int)(Math.random() * 10));
				problem.setNum2((int)(Math.random() * 10));

				System.out.println(problem.getNum1() + " " + problem.getOperator() + " " + problem.getNum2());

				int input = Integer.parseInt(getInput(""));

				if (input == problem.getAnswer()) {
					System.out.println("Correct");
					count += 1;
				} else {
					System.out.println("Incorrect");
				}
			}

			System.out.println("You got " + count + " correct of " + num + " problems.");
			boolean startAgain = checkExit();
			if (!startAgain) {
				break;
			}
		}
	}

	public static boolean checkExit() {
		String input = getInput("Do you want to start again? ");
		if (input.equals("yes")) {
			return true;
		} else {
			return false;
		}
	}

	public static Problem getProblem() {
		//0 for addition, 1 for substraction
		int operation = (int)(Math.random() * 2);

		Problem problem;

		if (operation == 0) {
			problem = new Addition();
		} else {
			problem = new Substraction();
		}
		return problem;
	}

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

