import java.util.*;

public class TestDatabase {

	public static void main(String args[]) {
		Database database = new Database();
		database.getFromWebServer(new CarSharer("01", "02", "03", "04"));
		ArrayList<CarSharer> testFranchise = new ArrayList<CarSharer>();
		testFranchise.add(new CarSharer("11", "12", "13", "14"));
		testFranchise.add(new CarSharer("21", "22", "23", "24"));
		testFranchise.add(new CarSharer("31", "32", "33", "34"));
		Franchise newFranchise = new Franchise("FN", "FA");
		ArrayList<CarSharer> clone = new ArrayList<CarSharer>(testFranchise);
		database.getFromFranchise(newFranchise, testFranchise);
		clone.add(new CarSharer("41", "42", "43", "44"));
		database.getFromFranchise(newFranchise, clone);
		database.getFromFranchise(new Franchise("F2N", "F2A"), testFranchise);
		database.printReport();
	}
}
