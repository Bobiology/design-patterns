package test;

import java.text.NumberFormat;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		byte age = 30;
		int viewsCount = 567_874_987;
		long views = 567_874_987L;
		float price = 29.40F;
		double cost = 9_383_744_889.90;
		char letter = 'A';

		// currency format
		NumberFormat currency = NumberFormat.getCurrencyInstance();
		String result = currency.format(1717238494.981);
		// System.out.println(result);

		// number format
		NumberFormat number = NumberFormat.getNumberInstance();
		String resulta = number.format(12892463.97449383);
		// System.out.println(resulta);

		// percentage format
		NumberFormat percentage = NumberFormat.getPercentInstance();
		String outcome = percentage.format(0.34);
		// System.out.println(outcome);

		// method chaining
		String newResult = NumberFormat.getPercentInstance().format(0.34);

		// System.out.println(NumberFormat.getPercentInstance().format(0.34));
		System.out.println("Morgage value: " + getMorgageValue());

		// ternaryOperator();
	}

	static String getMorgageValue() {
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		int principle = 0;
		float annualInterest = 0;
		float monthlyInterest = 0;
		byte year = 0;
		int numberOfPayments = 0;
		String morgageValue = "";
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Principle(KES1,000,000 - KES15,000,000):");
			while (true) {
				principle = scanner.nextInt();
				if (principle >= 1_000_000 && principle <= 15_000_000)
					break;
				System.out.println("Enter principal amount between KES 1,000,000 and KES 15,000,000");
			}
			System.out.print("Annual Interest Rates:");
			while (true) {
				annualInterest = scanner.nextFloat();
				if (annualInterest > 0 && annualInterest < 31) {
					monthlyInterest = annualInterest / MONTHS_IN_YEAR / PERCENT;
					break;
				}
				System.out.println("Enter interest between 1 and 30");
			}
			System.out.print("Period (Years):");
			while (true) {
				year = scanner.nextByte();
				if (year > 0 && year <= 30) {
					numberOfPayments = year * MONTHS_IN_YEAR;
					morgageValue=calculateMorgage(principle, monthlyInterest, numberOfPayments);
					break;
				}
				System.out.println("Enter period between 1 and 30 years");
			}
			return morgageValue;
		}

	}

	static String calculateMorgage(int principle, float monthlyInterest, int numberOfPayments) {
		return NumberFormat.getCurrencyInstance()
				.format(principle * ((monthlyInterest * (Math.pow((1 + monthlyInterest), numberOfPayments)))
						/ (Math.pow((1 + monthlyInterest), numberOfPayments) - 1)));
	}

	static void ternaryOperator() {
		float income = 120_0000;
		String className = income > 100_000 ? "First" : "Economy";
		System.out.println(className);
	}

}
