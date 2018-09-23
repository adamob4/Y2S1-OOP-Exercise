import java.util.Scanner;

public class exer7_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 3-by-4 matric row by row:");
		
		double[][] m = new double[3][4];
		String[][] s = new String[3][4];
		
		s[0] = sc.nextLine().split(" ");
		s[1] = sc.nextLine().split(" ");
		s[2] = sc.nextLine().split(" ");
		
		for(int i = 0; i < s.length; i++){
			for(int j = 0; j < s[i].length; j++){
				m[i][j] = Double.parseDouble(s[i][j]);
			}
		}
		
		for(int i = 0; i < m[0].length; i++) {
			System.out.println("Sum of elements at column " + i + " is " + sumColumn(m, i));
		}
	}
	
	public static double sumColumn(double[][] m, int columnIndex) {
		double t = 0.0;
		for(int a = 0; a < m.length; a++) {
			t += m[a][columnIndex];
		}
		return t;
	}
}