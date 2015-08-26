public class TestIDCard {
	public static void main(String[] args) {
		IDCard card1 = new IDCard();
		IDCard card2 = new IDCard("Any Name", 123, "example1.jpg");

		System.out.println(card2.getName());

		card1.setID(234);
		card1.setFilename("OOM LAB 3");
		System.out.println(card1.getID());
		System.out.println(card1.getFilename());
	}
}
