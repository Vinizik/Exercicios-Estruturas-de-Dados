package grafostranspostos;

public class Edges<T> {

	public Vertex<T> origem;

	public Vertex<T> destino;

	public Edges(Vertex<T> origem, Vertex<T> destino) {

		this.origem = origem;

		this.destino = destino;

	}

}
