package inverterfila;

public class Node {

	public Node prox;

	public Node ant;

	public String dado;

	public Node(String dado) {

		this.dado = dado;

		this.prox = null;

		this.ant = null;

	}

}
