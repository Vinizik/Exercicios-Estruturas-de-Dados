package gabaritosfaltando;

public class Result {

	static Stack pilha = new Stack();

	static Stack pAuxiliar = new Stack();

	public static boolean isPalindrome(String phrase) {

		boolean aux = true;

		for (int i = 0; i < phrase.length(); i++) {

			if (!phrase.substring(i, i + 1).toLowerCase().equals(" "))

				pAuxiliar.push(phrase.substring(i, i + 1).toLowerCase());

		}

		for (int i = (phrase.length() - 1); i >= 0; i--) {

			if (!phrase.substring(i, i + 1).toLowerCase().equals(" ")) {

				pilha.push(phrase.substring(i, i + 1).toLowerCase());

			}

		}

		while (pilha.size() > 0) {

			if (pilha.top().equals(pAuxiliar.top())) {

				pilha.pop();

				pAuxiliar.pop();

			} else {

				aux = false;

				break;

			}

		}

		return aux;

	}

}
