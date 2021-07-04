
public class NumbersHelperFunction {

	static int LowestOfNumbers(int a[]) {
		if (a.length == 0) {
			return 0;
		} else {

			int min = a[0];
			for (int i = 0; i < a.length; i++) {
				if (a[i] < min) {
					min = a[i];
				}
			}
			return min;
		}
	}

	static int HighestOfNumbers(int a[]) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {

			if (a[i] > max) {
				max = a[i];

			}
		}
		return max;
	}

	// Sum of numbers

	static void SumOfNumbers(int a[]) {
		int add = 0;
		for (int i = 0; i < a.length; i++) {
			add = add + a[i];
			System.out.println(add);
		}
		System.out.println("sum of numbers" + add);
	}

	// Factorial of the number

	static int Factorial(int x) {
		int fact = 1;
		for (int i = 1; i <= x; i++) {
			fact = fact * i;
		}
		return fact;
	}

	

		int b[] = { 33, 85, 32 };
		int minimumValue = NumbersHelperFunction.LowestOfNumbers(new int[] {});
		System.out.println("the minimum of the numbers is = " + minimumValue);
		// System.out.println(NumbersHelperFunction.LowestOfNumbers(new int[] {4,7,3}));
		NumbersHelperFunction.SumOfNumbers(b);
		System.out.println("the maximum of the numbers is = "
				+ NumbersHelperFunction.HighestOfNumbers(new int[] { 29, 144, 4222 }));
		System.out.println("The factorial number is =" + NumbersHelperFunction.Factorial(5));

	}
}
