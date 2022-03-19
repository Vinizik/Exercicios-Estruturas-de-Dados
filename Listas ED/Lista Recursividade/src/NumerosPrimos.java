package listarecursividade;

public class NumerosPrimos {

	public static int divisores = 2;

	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		} else if (divisores > (number / 2)) {
			return true;
		} else {

			if (number % divisores == 0) {
				return false;
			} else {
				divisores = divisores + 1;
				return isPrime(number);
			}

		}
	}

}
