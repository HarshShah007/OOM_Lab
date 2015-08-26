public abstract class GraphicObject {

	int X;
	int Y;
	String orientation;
	String lineColor;
	String fillColor;

	void moveTo(int newX, int newY) {
		X = newX;
		Y = newY;
		System.out.println("Moved to X = " + newX + " Y = " + newY);
	}

	abstract void draw();

	abstract void resize();
}
