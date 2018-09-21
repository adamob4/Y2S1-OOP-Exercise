import java.util.Scanner;

public class exer3_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter year: (e.g., 2012): ");
		int y = sc.nextInt();

		System.out.print("Enter month: 1-12: ");
		int m = sc.nextInt();

		if(m < 3){
			if(m == 1) {
				m = 13;
			} else if(m == 2) {
				m = 14;
			}
			y--;
		}

		System.out.print("Enter the day of the month: 1-31: ");
		int q = sc.nextInt();

		String[] days = {
			"Saturday",
			"Sunday",
			"Monday",
			"Tuesday",
			"Wednesday",
			"Thursday",
			"Friday"
		};

		int j = y / 100;
		int k = y % 100;

		int h = ((q + ((26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7);

		System.out.printf("Day of the week is %s", days[h]);

		sc.close();
	}
}