package adega;

public class Node<T> {

	public Node<T> prox;

	public Node<T> ant;

	public Vinho dado;

	public Node(Vinho dado) {

		this.prox = null;

		this.dado = dado;

		this.ant = null;

	}

}
