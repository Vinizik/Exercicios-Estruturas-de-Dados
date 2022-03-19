package reverternnumeros;

public class NoFila {

	public NoFila prox;

	public NoFila ant;

	public int dado;

	public NoFila(int dado) {

		this.dado = dado;

		this.prox = null;

		this.ant = null;

	}

}
