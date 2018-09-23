import java.util.Scanner;

public class exer7_9 {
	static String[][] b = new String[3][3];
	static boolean curPlayer = true;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(!isGameOver()){
			drawFrame();
			System.out.print("Enter a row (0,1 or 2) for player " + getCurPlayer() + " : ");
			int r = sc.nextInt();
			System.out.print("Enter a column (0,1 or 2) for player " + getCurPlayer() + " : ");
			int c = sc.nextInt();
			
			if( isPlayableMove(r,c) ){
				curPlayer = !curPlayer;
			}
		}
	}
	
	public static void drawFrame() {
		drawLine();
		for(int i = 0; i < b.length; i++){
			String s = "|";
			for(int j = 0; j < b[i].length; j++) {
				if(b[i][j] == "X"){
					s += " "+ b[i][j] +" |";
				} else if(b[i][j] == "O"){
					s += " "+ b[i][j] +" |";
				} else {
					s += "   |";
				}
			}
			System.out.println(s);
			drawLine();
		}
	}
	
	public static void drawLine() {
		System.out.println("_____________");
	}
	
	public static boolean isGameOver() {
		return false;
	}
	
	public static String getCurPlayer() {
		if(curPlayer == true){
			return "X";
		} else {
			return "O";
		}
	}
	
	public static boolean isPlayableMove(int r, int c) {
		b[r][c] = getCurPlayer();
		return true;
	}
}