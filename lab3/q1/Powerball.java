public class Powerball {

	int[] whiteBalls = new int[5];
	int redBall;

	public void play() {
		for (int i = 0; i < 5; ++i) {
			whiteBalls[i] = ((int) (Math.random() * 49) + 1);
		}

		redBall = ((int) (Math.random() * 42) + 1);
	}

	public void displayResults() {
		for (int i = 0; i < 5; ++i) {
			System.out.println("White ball " + (i+1) + " is " + whiteBalls[i]);
		}
		System.out.println("Red ball is " + redBall);
	}
}


