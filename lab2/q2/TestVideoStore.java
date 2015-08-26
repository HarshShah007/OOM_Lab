public class TestVideoStore {

	public static void main(String[] args) {

		Movie newMovie = new Movie("Name", "1111", 44.5, "DVD");
		System.out.println(newMovie);
		Customer customer = new Customer("8888888888");
		customer.purchaseMovie(newMovie);
		System.out.println(newMovie);
		customer.purchaseNonMovieItem(newMovie);
		System.out.println(newMovie);
	}
}
