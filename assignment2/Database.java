import java.util.*;

public class Database {

	private ArrayList<CarSharer> carSharers;
	private HashMap<Franchise, ArrayList< ArrayList<CarSharer> >> fromFranchise;
	
	public Database() {
		carSharers = new ArrayList<CarSharer>();
		fromFranchise = new HashMap<Franchise, ArrayList< ArrayList<CarSharer> >>();
	}

	public void getFromOfficeStaff() {
		String name = Helper.getInput("Name ");
		String address = Helper.getInput("Address ");
		String detailsOfJourney = Helper.getInput("Details of Journey ");
		String preferences = Helper.getInput("Preferences ");
		carSharers.add(new CarSharer(name, address, detailsOfJourney, preferences));
	}

	public void getFromFranchise(Franchise franchise, ArrayList<CarSharer> list) {
		if (!fromFranchise.containsKey(franchise)) {
			fromFranchise.put(franchise, new ArrayList< ArrayList<CarSharer> >());
		}
		fromFranchise.get(franchise).add(list);
		for (CarSharer sharer : list) {
			carSharers.add(sharer);
		}
	}

	public void getFromWebServer(CarSharer sharer) {
		carSharers.add(sharer);
	}

	public void printDatabase() {
		for (CarSharer entry : carSharers) {
			System.out.println(entry);
			System.out.println("");
		}
	}

	public void printMatch() {
		for (int i = 1; i < carSharers.size(); i += 2) {
			System.out.println(carSharers.get(i));
			System.out.println("MATCHES WITH");
			System.out.println(carSharers.get(i - 1));
			System.out.println("");
		}
	}

	public void printReport() {
		for (Franchise franchise : fromFranchise.keySet()) {
			System.out.println("Franchise's Name: " + franchise.name);
			System.out.println("Franchise's Area: " + franchise.area);
			for (int i = 0; i < fromFranchise.get(franchise).size(); ++i) {
				System.out.println("Week " + (i+1) + " = " + fromFranchise.get(franchise).get(i).size());
			}
			System.out.println("");
		}
	}
	
}
