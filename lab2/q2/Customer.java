import java.util.*;

public class Customer {

	String phoneNumber;

	public Customer(String number) {
		this.phoneNumber = number;
	}

	public void purchaseMovie(Movie movie) {
		movie.isRented = true;
		movie.rentedTo = this;
		movie.dueDate = "Use any date algorithm";
	}

	public void purchaseNonMovieItem(Movie movie) {
		movie.nonMovieItems += 1;
	}
}
