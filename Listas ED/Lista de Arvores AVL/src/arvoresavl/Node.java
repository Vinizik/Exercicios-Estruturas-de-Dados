package arvoresavl;

public class Node<T> {

	public T dado;

	public Node<T> esquerda;

	public Node<T> direita;

	public int altura;

	public Node(T dado) {

		this.dado = dado;

		this.esquerda = null;

		this.direita = null;

		this.altura = 0;

	}

}
