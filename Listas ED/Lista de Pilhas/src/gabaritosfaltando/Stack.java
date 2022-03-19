package gabaritosfaltando;

public class Stack {

	public NodePilha topo;

	public NodePilha base;

	public int posicao = 0;

	public Stack() {

		this.topo = null;

		this.base = null;

	}

	public void push(String s) {

		NodePilha inserido = new NodePilha(s);

		if (topo == null) {

			topo = inserido;

		} else {

			inserido.prox = topo;

			topo = inserido;

		}

		posicao++;

	}

	public String pop() {

		String str = "";

		if (topo != null) {

			str = topo.dado;

			topo = topo.prox;

			posicao--;

		}

		return str;

	}

	public String top() {

		return topo.dado;

	}

	public int size() {

		return posicao;

	}

}
