package pilhadeparenteses;

public class Result {

	public static boolean contBrackets(String input) {

		boolean aux = true;

		Pilha pilha = new Pilha();

		for (int i = 0; i < input.length(); i++) {

			char item = input.charAt(i);

			if (item == '(' || item == '{' || item == '[') {

				pilha.push(item);

			} else if (item == ')' || item == '}' || item == ']') {

				if (pilha.posicao != 0) {

					pilha.pop();

				}

				else {

					aux = false;

					break;

				}

			}

		}

		if (pilha.posicao != 0) {

			aux = false;
		}

		return aux;

	}

}
