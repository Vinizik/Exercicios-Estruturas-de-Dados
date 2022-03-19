package cacaniquel;

public class ListaCircular {

	public No primeiro;

	public No ultimo;

	public ListaCircular() {

		primeiro = null;

		ultimo = null;

	}

	public void inserir(String valor) {

		No inserido = new No(valor);

		if (primeiro == null) {

			primeiro = inserido;

		} else {

			ultimo.next = inserido;

		}

		ultimo = inserido;

		ultimo.next = primeiro;

	}

}
