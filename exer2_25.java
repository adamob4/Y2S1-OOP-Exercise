import java.util.Scanner;

public class exer2_25 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Employee's name: ");
		String name = sc.nextLine();

		System.out.print("Number of hours worked in a week: ");
		double hours = sc.nextDouble();

		System.out.print("Hourly pay rate: ");
		double pay = sc.nextDouble();

		System.out.print("Federal tax withholding rate: ");
		double fwr = sc.nextDouble();

		System.out.print("State tax withholding rate: ");
		double stwr = sc.nextDouble();

		double gross = pay * hours;

		System.out.print("\n\n");

		double fwd = (fwr / 100) * gross;
		double stwd = (stwr / 100) * gross;

		double net_pay = gross - (fwd + stwd);
		
		System.out.printf("Employee Name: %s\n", name);
		System.out.printf("Hours Worked: %f\n", hours);
		System.out.printf("Pay Rate: %f\n", pay);
		System.out.printf("Gross Pay: %f\n", gross);
		System.out.println("Deductions:");
		System.out.printf("\tFederal Withholding (%f%%): %f\n", fwr, fwd);
		System.out.printf("\tState Withholding (%f%%): %f\n", stwr, stwd);
		System.out.printf("\tTotal Deduction: %f\n", fwd + stwd);
		System.out.printf("Net Pay: %f", net_pay);
	}
}