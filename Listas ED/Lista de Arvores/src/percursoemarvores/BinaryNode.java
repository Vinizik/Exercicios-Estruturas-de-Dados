package percursoemarvores;

public class BinaryNode {

	public int dado;

	public BinaryNode esquerda;

	public BinaryNode direita;

	public BinaryNode(int dado) {

		this.dado = dado;

		this.esquerda = null;

		this.direita = null;

	}

	public String toString() {

		return "" + dado;
	}

}
