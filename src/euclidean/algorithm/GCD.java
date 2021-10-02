package euclidean.algorithm;

public class GCD {
	public static void main(String[] args) {
		int a = 7, b = 11;
		System.err.println(getGCD(a, b));
	}

	static int getGCD(int a, int b) {
		int r = a % b;
		if (r == 0) {
			return b;
		}
		if (a > b) {
			return getGCD(a % b, b);
		} else {
			return getGCD(b % a, a);
		}
	}
}
