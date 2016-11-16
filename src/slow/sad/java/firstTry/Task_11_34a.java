package slow.sad.java.firstTry;

public class Task_11_34a {

	public static void main(String[] args) {
		int sum1 = 0;
		int sum2 = 0;
		int[] numbersOfFallout = new int[31];
		for (int i = 0; i < numbersOfFallout.length; ++i) {
			numbersOfFallout[i] = (int) (Math.random() * 30);
			System.out.print(numbersOfFallout[i] + ", ");
		}
		for (int i = 0; i < 15; ++i) {
			sum1 = sum1 + numbersOfFallout[i];
		}
		System.out.println("\n\nСумма первых 15-ти элементов массива = " + sum1);
		for (int i = 15; i < numbersOfFallout.length; ++i){
			sum2 = sum2 + numbersOfFallout[i];
		}System.out.println("Сумма последних 16-ти элементов массива = " + sum2);
		if (sum1 > sum2) {
			System.out.println("\nВ первую половину июля выпало больше осадков");
		}else if (sum2 > sum1) {
			System.out.println("\nВо вторую половину июля выпало больше осадков");
		}else{
			System.out.println("\nВ первую и вторую половину июля выпало одинаковое кол-во осадков");
		}
	}

}
