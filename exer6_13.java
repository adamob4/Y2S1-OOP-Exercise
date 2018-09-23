public class exer6_13 {
	public static void main(String[] args) {
		getRandom(22,45,51,52);
	}
	
	public static int getRandom(int... numbers) {
		boolean exists = true;
		int r = 1;
		existsloop:
		while(exists) {
			r = (int)((Math.random() * 54) + 1);
			for(int n : numbers) {
				if(n == r) {
					continue existsloop;
				}
			}
			exists = false;
		}
		
		System.out.println("The number is: " + r);
		return r;
	}
}