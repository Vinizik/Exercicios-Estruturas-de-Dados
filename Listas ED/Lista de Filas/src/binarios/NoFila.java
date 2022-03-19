package binarios;

public class NoFila<T> {

	public NoFila<T> prox;

	public NoFila<T> ant;

	public T dado;

	public NoFila(T dado) {

		this.dado = dado;

		this.prox = null;

		this.ant = null;

	}

}
