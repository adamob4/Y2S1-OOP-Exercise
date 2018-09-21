import java.util.Scanner;

public class exer2_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the monthly saving amount: ");
		double amount = sc.nextInt();

		double rate = 5.0;
		double total = 0;

		for(int m = 0; m < 6; m++){
			total = ((amount + total) * (1 + 0.05/12));
		}
		System.out.printf("After the sixth month, the account value is %f", total);
	}
}