package uniaodeconjuntos;

public class Lista {

	private Node primeiro;

	public Lista() {

		this.primeiro = null;

	}

	public void inserir(String num) {

		Node inserido = new Node(num);

		if (primeiro == null) {

			primeiro = inserido;

			return;
		}

		Node aux = primeiro;

		while (aux.prox != null) {

			aux = aux.prox;

		}

		aux.prox = inserido;

	}

	public String toString() {

		String r = "";

		Node auxiliar = primeiro;

		while (auxiliar != null) {

			r += auxiliar.getDado() + " ";
			auxiliar = auxiliar.prox;
		}

		return r;
	}

}
