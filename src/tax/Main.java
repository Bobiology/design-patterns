package tax;

public class Main {

	public static void main(String[] args) {
		TaxCalculator calculator = getTax();
		calculator.calculateTax();
	}
	static TaxCalculator getTax() {
		return new TaxCalculator2020();
		
	}
}
