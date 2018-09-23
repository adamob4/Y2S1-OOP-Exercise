import java.util.Scanner;

public class exer6_21 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of balls to drop: ");
		int b = sc.nextInt();
		
		System.out.print("Enter the number of slots in the bean machine: ");
		int s = sc.nextInt();
		
		String[] paths = new String[b];
		int[] slots = new int[s];
		
		for(int i = 0; i < b; i++) {
			String p = "";
			int c = 0;
			for(int j = 0; j < s; j++) {
				if(Math.random() > 0.5){
					p += "R";
					c++;
				} else {
					p += "L";
				}
			}
			paths[i] = p;
			slots[c]++;
			p = "";
		}
		
		for(String p : paths) {
			System.out.println(p);
		}
		
		int biggest = 0;
		for(int i : slots){
			if(i > biggest){
				biggest = i;
			}
		}
		
		for(int row = b; row > 0; row--){
			for(int slot = 0; slot < slots.length; slot++){
				if(slots[slot] >= row){
					System.out.print("0 ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
		
		/*for(int i = 0; i < b; i++){
			for(int j = 0; j < s; j++){
				if(slots[j] > i){
					System.out.print("0 ");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}*/
	}
}