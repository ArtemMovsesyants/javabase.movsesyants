package slow.sad.java.Task1FromZhenya;

public class Dots_coor {
	public static int coorCounter;
	private int xCoor;
	private int yCoor;

	public Dots_coor() {
		System.out.println("Создается Dots_coor");
		coorCounter++;
	}
	
	public Dots_coor(int startingX, int startingY){
		setXcoor(startingX);
		setYcoor(startingY);
		coorCounter++;
	}
	
	public void setXcoor(int xCoor) {
		if (xCoor > 10) {
			this.xCoor = 10;
		} else if (xCoor < -10) {
			this.xCoor = -10;
		} else {
			this.xCoor = xCoor;
		}
	}

	public int getXcoor() {
		return xCoor;
	}

	public void setYcoor(int yCoor) {
		if (yCoor > 10) {
			this.yCoor = 10;
		} else if (yCoor < -10) {
			this.yCoor = -10;
		} else {
			this.yCoor = yCoor;
		}
	}

	public int getYcoor() {
		return yCoor;
	}

}