package textosequencial;

public class Solution {

	static Pilha pilha = new Pilha();

	public static void inserir(String t) {

		if (pilha.posicao == 0) {

			pilha.push(t);

		} else {

			t = t.replace("\"", "");

			if (pilha.top().charAt(pilha.top().length() - 1) == '\"') {

				pilha.push(pilha.top().substring(0, (pilha.top().length() - 1)) + t + "\"");

			}

			else {

				if (pilha.top().charAt(0) == '\"') {

					pilha.push(pilha.top().substring(0, (pilha.top().length() - 1)) + t);

				} else {

					pilha.push(pilha.top() + t);

				}

			}

		}

	}

	public static void alteracoes() {

		pilha.print();

	}

	public static void desfazer() {

		pilha.pop();

	}

}
