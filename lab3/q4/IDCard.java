public class IDCard {

	private String name;
	private int ID;
	private String filename;

	public IDCard() {
		;
	}

	public IDCard(String name, int ID, String filename) {
		this.name = name;
		this.ID = ID;
		this.filename = filename;
	}

	public String getName() {
		return name;
	}

	public int getID() {
		return ID;
	}

	public String getFilename() {
		return filename;
	}

	public void setName(String newName) {
		name = newName;
	}

	public void setID(int newID) {
		ID = newID;
	}

	public void setFilename(String newFilename) {
		filename = newFilename;
	}
}


	
