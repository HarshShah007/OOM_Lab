public class ElevatorProgram {

	public static void main(String[] args) {

		Elevator e1 = new Elevator();
		System.out.println("New elevator object");
		e1.goToFloor(5);
		e1.openDoors();
		e1.closeDoors();

		Elevator e2 = new Elevator();
		System.out.println("New elevator object");
		e2.goToFloor(1);
		e2.closeDoors();
		e2.goingUp();
		System.out.println(e2.isGoingUp);
	}
}
