public abstract class Problem {

	private int num1;
	private int num2;

	public abstract int getAnswer();

	public abstract String getOperator();

	public void setNum1(int num) {
		num1 = num;
	}

	public int getNum1() {
		return num1;
	}

	public void setNum2(int num) {
		num2 = num;
	}

	public int getNum2() {
		return num2;
	}
}
