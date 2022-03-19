package uniaodepilhas;

public class Stack {

	public Node topo;

	public Node base;

	public int posicao = 0;

	public Stack() {

		this.topo = null;

		this.base = null;

	}

	public void push(String inputValue) {

		Node inserido = new Node(inputValue);

		if (topo == null) {

			topo = inserido;

		} else {

			inserido.prox = topo;

			topo = inserido;

		}

		posicao++;

	}

	public String pop() {

		String s = "";

		if (topo != null) {

			s = topo.dado;

			topo = topo.prox;

			posicao--;

		}

		return s;

	}

	public String peek(String s) {

		return topo.dado;

	}

	public String toString() {

		String str = "";

		Node aux = topo;

		while (aux != null) {

			str += aux.dado + " ";

			aux = aux.prox;

		}

		return str;

	}

	public int size() {

		return posicao;

	}

}
