public class TestRestaurant {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant(1, 2, 3, 4.5);
		restaurant.setNumCoke(1);
		restaurant.setNumFries(2);
		restaurant.setNumBurger(3);
		restaurant.anounceTotal();
	}
}

