package ch03.sec04;

public class AccuracyExample1 {

	public static void main(String[] args) {
		int apple = 10;
		double pieceUnit = 0.1;
		int number = 7;
		
		int result1 = (apple - number * (int)(pieceUnit * 10));
		System.out.println("10조각에서 남은 조각: " + result1);
		double result2 = (double)result1 / 10;
		System.out.println("사과 1개에서 남은 양: " + result2);
	}

}
