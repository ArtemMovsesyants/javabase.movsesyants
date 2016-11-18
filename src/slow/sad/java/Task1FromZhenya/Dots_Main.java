package slow.sad.java.Task1FromZhenya;

public class Dots_Main {

	public static void main(String[] args) {
		final int coorCount = 3;
		Dots_coor[] coordinates = new Dots_coor [coorCount];
		coordinates[0] = new Dots_coor(7, 1);
		coordinates[1] = new Dots_coor(9, 4);
		
		coordinates[2] = new Dots_coor();
		coordinates[2].setXcoor(1);
		coordinates[2].setYcoor(9);
		
		bubbleSort(coordinates);
		System.out.println(Dots_coor.coorCounter);
		printCoor(coordinates);
	}
	
	private static void printCoor(Dots_coor[] coordinates){
		for(int i = 0; i < coordinates.length; ++i) {
			Dots_coor dots = coordinates[i];
			String dotsInString = dotsToString(dots);
			System.out.printf("%d. %s%n", i + 1,
					dotsInString);
		
		}
	}
	
	private static void bubbleSort (Dots_coor[] coordinates){
		for(int i = coordinates.length - 1; i > 0; --i){
			for (int j = 0; j < i; ++j) {
				if (coordinates[j].getXcoor() + coordinates[j].getYcoor()
						> coordinates[j+1].getXcoor() + coordinates[i].getYcoor()){
					
					Dots_coor change = coordinates[j];
					coordinates[j] = coordinates[j+1];
					coordinates[j+1] = change;
					
				}
			}
		}
		
	}
	
	private static String dotsToString (Dots_coor dots){
		StringBuilder sb = new StringBuilder();
		sb.append(dots.getXcoor())
		  .append(" - ")
		  .append(dots.getYcoor());

		return sb.toString();
	}

}
