package grafostranspostos;

import java.util.List;

public class Grafo {

	public ImplementedList<Vertex> vertices = new ImplementedList<>();

	public ImplementedList<Edges> arestas = new ImplementedList<>();

	public void addVertex(Integer v) {

		Vertex vtc = new Vertex(v);

		if (!vertices.consultarVertex(vtc)) {

			vertices.inserir(vtc);

		}

	}

	public void addEdge(Integer origem, Integer destino) {

		addVertex(origem);

		addVertex(destino);

		Vertex vrtc1 = new Vertex(origem);

		Vertex vrtc2 = new Vertex(destino);

		Edges arst = new Edges(vrtc1, vrtc2);

		if (!arestas.consultarEdges(arst)) {

			arestas.inserir(arst);

		}

	}

	public void transporGrafo() {

		for (int i = 0; i < arestas.size(); i++) {

			int aux = arestas.get(i).origem.valor;

			arestas.get(i).origem.valor = arestas.get(i).destino.valor;

			arestas.get(i).destino.valor = aux;

		}

	}

	public void ordenarVertices() {

		for (int i = 0; i < vertices.size(); i++) {

			for (int j = i + 1; j < vertices.size(); j++) {

				if ((vertices.get(i).valor - vertices.get(j).valor) > 0) {

					int aux = vertices.get(i).valor;

					vertices.get(i).valor = vertices.get(j).valor;

					vertices.get(j).valor = aux;

				}

			}

		}

	}

	public void imprimirGrafo() {
		ordenarVertices();
		String s = "";
		for (int i = 0; i < vertices.size(); i++) {
			s += String.format("%s\n", NodesPointingTo(vertices.get(i)));
		}
		System.out.print(s);
	}

	public String NodesPointingTo(Vertex vertex) {

		int contador = 0;

		String result = vertex.valor + "-->";

		for (int i = 0; i < arestas.size(); i++) {

			if (vertex.valor == arestas.get(i).origem.valor) {

				if (contador >= 1) {

					result += " ";

				}

				result += arestas.get(i).destino.valor;

				contador++;

			}

		}

		return result;

	}

	public static boolean isNumeric(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void Resultado(List<String> entrada) {
		Grafo grafo = new Grafo();
		String[] entradaVertices = entrada.toArray(new String[0]);
		for (int i = 0; i < entradaVertices.length; i++) {
			String vertice = entradaVertices[i].replaceAll("(?:--.*)", "");
			String[] arrayLigacoes = entradaVertices[i].replaceAll("^[0-9]-->", "").split(" ");

			for (int j = 0; j < arrayLigacoes.length; j++) {
				if (isNumeric(arrayLigacoes[j]) && isNumeric(vertice)) {
					Integer verticeValue = Integer.parseInt(vertice);
					Integer ligacao = Integer.parseInt(arrayLigacoes[j]);

					grafo.addEdge(verticeValue, ligacao);
				}
			}

		}
		grafo.transporGrafo();
		grafo.imprimirGrafo();

	}

}
