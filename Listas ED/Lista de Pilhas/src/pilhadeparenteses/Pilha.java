package pilhadeparenteses;

public class Pilha {

	public Node topo;

	public Node base;

	public int posicao = 0;

	public Pilha() {

		this.topo = null;

		this.base = null;

	}

	public void push(char c) {

		Node inserido = new Node(c);

		if (topo == null) {

			topo = inserido;

		} else {

			inserido.prox = topo;

			topo = inserido;

		}

		posicao++;

	}

	public char pop() {

		char s = 0;

		if (topo != null) {

			s = topo.dado;

			topo = topo.prox;

			posicao--;

		}

		return s;

	}

	public char peek(char s) {

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

}
