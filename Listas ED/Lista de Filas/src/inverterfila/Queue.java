package inverterfila;

public class Queue {

	public Node primeiro;

	public Node ultimo;

	public int posicao = 0;

	public Queue() {

		this.primeiro = null;

		this.ultimo = null;

	}

	public boolean isEmpty() {

		return posicao == 0;

	}

	public void enqueue(String value) {

		Node inserido = new Node(value);

		if (primeiro == null) {

			primeiro = ultimo = inserido;

		} else {

			ultimo.prox = inserido;

			ultimo = inserido;

		}

		posicao++;

	}

	public String dequeue() {

		String r = "";

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
