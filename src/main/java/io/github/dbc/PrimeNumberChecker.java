package io.github.dbc;

public class PrimeNumberChecker {
	/**
	 * This method checks if the given number is prime.
	 *
	 * @param number the number to check.
	 * @return true if the number is prime, false otherwise.
	 */
	public boolean isPrime(int number) {
		int m = number / 2;
		if (number < 2) {
			return false;
		} else {
			for (int i = 2; i <= m; i++) {
				if (number % i == 0) {
					return false;
				}
			}
		}

		return true;
	}
}
