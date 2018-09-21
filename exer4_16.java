import java.util.Scanner;

public class exer4_16 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter an integer to find the smallest factors: ");
		int n = sc.nextInt();

		String res = "";
		int c = 1;
		while(c < n) {
			if(!(c % 2 == 0 || c % 3 == 0 || c % 5 == 0)){
				res += c + ", ";
			}
			c++;
			System.out.println(c);
		}

		System.out.println(res);

		sc.close();
	}
}