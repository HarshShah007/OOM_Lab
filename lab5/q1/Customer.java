import java.util.*;

public class Customer {

	String phoneNumber;

	public Customer(String number) {
		this.phoneNumber = number;
	}

	public void purchaseMovie(Movie movie) {
		System.out.println("In method purchaseMovie");
		movie.isRented = true;
		movie.rentedTo = this;
		movie.dueDate = "Use any date algorithm";
	}

	public void purchaseNonMovieItem(Movie movie) {
		System.out.println("In method purchaseNonMovieItem");
		movie.nonMovieItems += 1;
	}
}
