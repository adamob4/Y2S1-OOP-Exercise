public class exer5_5 {
	public static void main(String[] args) {
		displayLargestNumber(1000.0, 33.3, 243.6);
	}

	public static void displayLargestNumber(double num1, double num2, double num3) {		
		System.out.println(Math.max( Math.max(num1, num2), num3 ));
	}
}