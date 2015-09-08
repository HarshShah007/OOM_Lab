public class Elevator {

	int currentFloor;
	int headingFloor;
	boolean isGoingUp;
	boolean isDoorOpen;

	public void goToFloor(int floor) {
		headingFloor = floor;
		System.out.println("Heading towards " + floor);
	}

	public void openDoors() {
		System.out.println("Doors are opened");
		isDoorOpen = true;
	}

	public void closeDoors() {
		System.out.println("Doors are closed");
		isDoorOpen = false;
	}

	public void goingUp() {
		System.out.println("Going up");
		isGoingUp = true;
	}

	public void goingDown() {
		System.out.println("Going down");
		isGoingUp = false;
	}
}
