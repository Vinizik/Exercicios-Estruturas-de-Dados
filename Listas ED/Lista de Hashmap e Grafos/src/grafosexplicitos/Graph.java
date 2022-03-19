package grafosexplicitos;

public class Graph {

	private ImplementedList<Vertex> vertices = new ImplementedList<>();

	private ImplementedList<Edges> arestas = new ImplementedList<>();

	public String[] ordenarVertices(String[] vertcs, int tamanho) {

		for (int i = 0; i < tamanho - 1; i++) {

			for (int j = 0; j < tamanho - i - 1; j++) {

				int espaco1 = vertcs[j].indexOf(" ");

				int num1 = Integer.parseInt(vertcs[j].substring(1, espaco1));

				int espaco2 = vertcs[j + 1].indexOf(" ");

				int num2 = Integer.parseInt(vertcs[j + 1].substring(1, espaco2));

				if ((num1 - num2) > 0) {

					String aux = vertcs[j];

					vertcs[j] = vertcs[j + 1];

					vertcs[j + 1] = aux;

				}

			}

		}

		return vertcs;

	}

	public String transformarArrayEmString(String[] arr) {

		String str = "";

		for (int i = 0; i < arr.length; i++) {

			str += arr[i] + "\n";

		}

		return str;

	}

	public void addVertex(Integer v) {

		Vertex vtc = new Vertex(v);

		if (!vertices.consultarVertex(vtc)) {

			vertices.inserir(vtc);

		}

	}

	public void addEdge(Integer src, Integer dst) {

		addVertex(src);

		addVertex(dst);

		Vertex vrtc1 = new Vertex(src);

		Vertex vrtc2 = new Vertex(dst);

		Edges arst = new Edges(vrtc1, vrtc2);

		if (!arestas.consultarEdges(arst)) {

			arestas.inserir(arst);

		}

	}

	public String toString() {
		String[] str;
		String s = "";
		for (int i = 0; i < vertices.size(); i++) {
			s += String.format("(%s)\n", NodesPointingTo(vertices.get(i)));
		}
		str = ordenarVertices(s.split("\n"), vertices.size());
		s = transformarArrayEmString(str);
		return s;
	}

	public String NodesPointingTo(Vertex vertex) {

		int contador = 0;

		String result = vertex.valor + " [";

		for (int i = 0; i < arestas.size(); i++) {

			if (vertex.valor == arestas.get(i).origem.valor) {

				if (contador >= 1) {

					result += " ";

				}

				result += arestas.get(i).destino.valor;

				contador++;

			}

		}

		return result + "]";

	}

}
