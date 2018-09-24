import java.util.Scanner;

public class exer7_9 {
	static String[][] b = new String[3][3];
	static boolean curPlayer = true;
	static int[] curMove = new int[2];
	static int movesMade = 0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < b.length; i++){
			for(int j = 0; j < b[0].length; j++){
				b[i][j] = Integer.toString(i + j + 3);
			}
		}

		while(true){
			drawFrame();
			curMove = getPlayerMove(sc);
			
			if( isPlayableMove(curMove) ){
				curPlayer = !curPlayer;
				movesMade++;
			} else {
				continue;
			}

			if( movesMade > 2 && isGameOver() ) {
				drawFrame();
				curPlayer = !curPlayer;
				System.out.println("Player " + getCurPlayer() + " has won!");
				break;
			}
		}

		sc.close();
	}
	
	public static void drawFrame() {
		System.out.println("    0   1   2  ");
		drawLine();
		for(int i = 0; i < b.length; i++){
			String s = i + " |";
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
		System.out.println("  _____________");
	}
	
	public static boolean isGameOver() {
		// Check for horizontal win
		for(int r = 0; r < 3; r++){
			if( b[r][0] == b[r][1] && b[r][1] == b[r][2] ){
				return true;
			}
		}
		// Check for vertical win
		for(int c = 0; c < 3; c++){
			if( b[0][c] == b[1][c] && b[1][c] == b[2][c] ){
				return true;
			}
		}

		//Check for angled win
		if( b[0][0] == b[1][1] && b[1][1] == b[2][2] ){
			return true;
		}
		if( b[0][2] == b[1][1] && b[1][1] == b[2][0] ){
			return true;
		}

		return false;
	}
	
	public static String getCurPlayer() {
		if(curPlayer == true){
			return "X";
		} else {
			return "O";
		}
	}
	
	public static boolean isPlayableMove(int[] m) {
		if(b[m[0]][m[1]] == "O" || b[m[0]][m[1]] == "X") {
			System.out.println("That spot is already taken.");
			return false;
		}
		b[m[0]][m[1]] = getCurPlayer();
		return true;
	}

	public static int[] getPlayerMove(Scanner sc){
		int[] move = new int[2];
		System.out.print("Enter a row (0,1 or 2) for player " + getCurPlayer() + " : ");
		move[0] = sc.nextInt();
		System.out.print("Enter a column (0,1 or 2) for player " + getCurPlayer() + " : ");
		move[1] = sc.nextInt();

		return move;
	}
}