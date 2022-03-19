package mdc;

public class Fila {

	public Node primeiro;

	public Node ultimo;

	public int posicao = 0;

	public Fila() {

		this.primeiro = null;

		this.ultimo = null;

	}

	public void inserir(int n) {

		Node inserido = new Node(n);

		if (primeiro == null) {

			primeiro = ultimo = inserido;

		} else {

			ultimo.prox = inserido;

			ultimo = inserido;

		}

		posicao++;

	}

	public int remover() {

		int r = 0;

		if (posicao > 0) {

			r = primeiro.dado;

			primeiro = primeiro.prox;

			if (primeiro == null) {

				ultimo = null;

			}

			posicao--;

		}

		return r;

	}

}
