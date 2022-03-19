package inverterarvorebinaria;

public class No<T> {

	public T dado;

	public No<T> esquerda;

	public No<T> direita;

	public No(T dado) {

		this.dado = dado;

		this.esquerda = null;

		this.direita = null;

	}

}
