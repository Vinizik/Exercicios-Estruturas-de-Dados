package mdc;

public class Result {

	public static int mdcAux(int a, int b) {

		int divisor = 1;

		for (int i = 1; i <= a && i <= b; i++) {

			if (a % i == 0 && b % i == 0) {

				divisor = i;

			}

		}

		return divisor;

	}

	public static int mdc(int number1, int number2) {

		Fila fila = new Fila();

		int maiorDivisorComum = 0;

		maiorDivisorComum = mdcAux(number1, number2);

		if (maiorDivisorComum > 1) {

			fila.inserir(maiorDivisorComum);

		}

		return maiorDivisorComum;

	}

}
