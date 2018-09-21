import java.util.Scanner;

public class exer4_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Sum a series up to: ");
		int n = sc.nextInt();

		int total = 1;
		for(int i = 1; i < n; i++){
			for(int j = 1; j-1 <= i; j++){
				total += j;
			}
		}

		System.out.printf("Series adds up to: %d", total);

		sc.close();
	}
}