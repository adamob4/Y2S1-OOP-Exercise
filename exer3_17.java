import java.util.Scanner;

public class exer3_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] choice = {
			"rock", "paper", "scissors"
		};

		int pc = (int)(Math.random() * 3);

		System.out.print("rock: 0, paper: 1, scissor: 2 :");
		int pl = sc.nextInt();

		if(pl >= 0 && pl < 3){
			if(pc == pl){
				System.out.printf("The computer chose %s. You chose %s too.", choice[pc], choice[pl]);
			} else {
				System.out.printf("The computer chose %s. You chose %s. ", choice[pc], choice[pl]);

				if((pc == 0 && pl == 1) || (pc == 1 && pl == 2) || (pc == 2 && pl == 0) ){
					System.out.print("You won!");
				} else {
					System.out.print("The computer won!");
				}
			}
		} else {
			System.out.print("Invalid choice.");
		}

		sc.close();
	}
}