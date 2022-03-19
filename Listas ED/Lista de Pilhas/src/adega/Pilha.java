package adega;

public class Pilha<T> {

	public Node<T> topo;

	public Node<T> base;

	public int posicao = 0;

	public Pilha() {

		this.topo = null;

		this.base = null;

	}

	public void push(Vinho dado) {

		Node<T> inserido = new Node<T>(dado);

		if (topo == null) {

			topo = inserido;

		} else {

			inserido.prox = topo;

			topo = inserido;

		}

		posicao++;

	}

	public Vinho pop() {

		Vinho s = null;

		if (topo != null) {

			s = topo.dado;

			topo = topo.prox;

			posicao--;

		}

		return s;

	}

	public Vinho top() {

		return topo.dado;

	}

	public String toString() {

		String str = "";

		Node<T> aux = topo;

		while (aux != null) {

			str += aux.dado;

			aux = aux.prox;

		}

		return str;

	}

	public int size() {

		return posicao;

	}

}
