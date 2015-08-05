public class Restaurant {

	private double coke;
	private double fries;
	private double burger;
	private double taxRate;

	int numCoke;
	int numFries;
	int numBurger;

	public Restaurant(double cokePrice, double friesPrice, double burgerPrice, double taxRate) {
		coke = cokePrice;
		fries = friesPrice;
		burger = burgerPrice;
		this.taxRate = taxRate;
	}

	public void greet() {
		System.out.println("Welcome!");
	}

	public void statePrices() {
		System.out.println("Today's prices are: ");
		System.out.println("Coke = " + coke);
		System.out.println("Fries = " + fries);
		System.out.println("Burger = " + burger);
	}

	public void setNumCoke(int numCoke) {
		this.numCoke = numCoke;
	}

	public void setNumFries(int numFries) {
		this.numFries = numFries;
	}

	public void setNumBurger(int numBurger) {
		this.numBurger = numBurger;
	}

	public double calculateTotal() {
		double subTotal = coke * numCoke + fries * numFries + burger * numBurger;
		double grandTotal = subTotal + (subTotal * taxRate / 100);
		return grandTotal;
	}

	public void anounceTotal() {
		System.out.println(calculateTotal());
	}
}

