package textosequencial;

public class Pilha {

	public NoPilha topo;

	public NoPilha base;

	public int posicao = 0;

	public Pilha() {

		this.topo = null;

		this.base = null;

	}

	public void push(String s) {

		NoPilha inserido = new NoPilha(s);

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

	public String top() {

		return topo.dado;

	}

	public void print() {

		String str = "Topo->";

		NoPilha aux = topo;

		while (aux != null) {

			str += aux.dado + "->";

			aux = aux.prox;

		}

		System.out.println(str.substring(0, str.length() - 2));

	}

}
