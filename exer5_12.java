public class exer5_12 {
	public static void main(String[] args) {
		printChars('a', 's', 5);
	}
	
	public static void printChars(char ch1, char ch2, int numberPerLine) {
		for(int i = 0; i < ch2 + 1 - ch1; i++) {
			if(i%numberPerLine == 0) {
				System.out.print("\n");
			}
			
			System.out.print((char)(ch1 + i) + " ");
		}
	}
}