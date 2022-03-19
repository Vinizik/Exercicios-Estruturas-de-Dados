package grafostranspostos;

public class NoLista<T> {

	public T dado;

	public NoLista<T> prox;

	public NoLista(T dado) {

		this.dado = dado;

		this.prox = null;

	}

	public boolean compararVertex(T var) {

		return ((Vertex) dado).valor == ((Vertex) var).valor;

	}

	public boolean compararEdges(T var) {

		return ((Edges) dado).origem.valor == ((Edges) var).origem.valor
				&& ((Edges) dado).destino.valor == ((Edges) var).destino.valor;

	}

}
