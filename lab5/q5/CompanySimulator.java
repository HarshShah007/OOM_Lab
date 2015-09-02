import java.util.ArrayList;
import java.util.Random;


public class CompanySimulator {

	private int currentTime;
	

	private ArrayList<Employee> company;

	private void initCompany() {
		company = new ArrayList<Employee>();
		
		company.add(new Executive());
		
		for (int i = 0; i < 3; i++) {
			company.add(new SoftwareManager());
			for (int j = 0; j < 2; j++) {
				company.add(new SoftwareEngineer());
			}
		}
	}
	
	public void run(int runTime) {
		initCompany();
		
		Random timeGen = new Random();

		currentTime = 0;
		while (currentTime <= runTime) {

			int scheduledTime = timeGen.nextInt(10) + 1;

			currentTime += scheduledTime;
			System.out.println("Current Time: " + currentTime);
			performWork();
			
			System.out.println("\n");
		}
	}

	private void performWork() {
		
		for (Employee emp : company) {
			if (!emp.work())
				manageCrisis(emp);
		}

	}
	private void manageCrisis(Employee emp) {
		//TODO Implement CompanySimulator.manageCrisis
		if (emp instanceof SoftwareManager) {
			((Executive)company.get(0)).handleCrisis();
		} else {
			int index = company.indexOf(emp);
			index -= 1;
			while (index > 0) {
				if (company.get(index) instanceof SoftwareManager) {
					((SoftwareManager)company.get(index)).handleCrisis();
					break;
				}
				index -= 1;
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CompanySimulator sim = new CompanySimulator();
		sim.run(100);
	}


}
