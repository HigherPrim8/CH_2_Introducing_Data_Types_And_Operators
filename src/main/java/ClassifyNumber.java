public class ClassifyNumber {

	// 1. Write a method isEven, that takes an int as a parameter and returns true
	// if the int is even, false if it is odd.

	// 2. Write a method called isEvenAndPositive, that takes an int as a parameter
	// and returns true if the int is even AND positive, anything else should return false.
	// 0 is NOT considered positive in this situation.

	public static boolean isEven(int x) {
		if (x % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isEvenAndPositive(int x) {
		if (x % 2 == 0) {
			if (x > 0) {
				System.out.print("The number is Positive.");
				return true;
			} else if (x < 0) {
				System.out.print("The number is negative.");
			} else {
				System.out.print("The number is Zero.");
			}
		}
		return false;
	}
}
