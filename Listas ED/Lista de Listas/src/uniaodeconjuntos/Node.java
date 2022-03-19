package uniaodeconjuntos;

public class Node {

	public String dado;

	public Node prox;

	public Node(String d) {

		dado = d;

		prox = null;
	}

	public void setDado(String dado) {

		this.dado = dado;
	}

	public String getDado() {

		return dado;
	}
}
