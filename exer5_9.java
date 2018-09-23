public class exer5_9 {
	public static void main(String[] args) {
		System.out.println("Feet\t\tMeters\t\t|\tMeters\t\tFeet");
		System.out.print("________________________________");
		System.out.println("________________________________");
		for(double i = 1.0; i < 11.0; i++) {
			System.out.printf("%.2f\t\t%.3f\t|\t\t%.2f\t\t%.3f\n", i, footToMeter(i), (i * 5) + 15.0, meterToFoot((i * 5) + 15.0));
		}
	}

	public static double footToMeter(double foot) {
		return foot * 0.305;
	}

	public static double meterToFoot(double meter) {
		return meter * 3.281;
	}
}