package removernos;

public class BinaryTree<T> {

	private Node initialNode;

	public int posicao = 0;

	public BinaryTree() {

		this.initialNode = null;

	}

	public void add(String elem) {

		if (initialNode == null) {

			initialNode = new Node(elem);

		} else {

			Node aux = initialNode;

			while (aux != null) {

				int aux2 = aux.dado.compareTo(elem);

				if (aux2 == 0) {

					System.out.print("Ja contido na arvore");

					break;

				} else if (aux2 < 0) {

					if (aux.direita != null) {

						aux = aux.direita;

					} else {

						aux.direita = new Node(elem);

						break;
					}

				} else {

					if (aux.esquerda != null) {

						aux = aux.esquerda;

					} else {

						aux.esquerda = new Node(elem);

						break;

					}
				}

			}

		}

		posicao++;

	}

	public void remover(String elem) {

		boolean b = false;

		if (initialNode != null) {

			int aux = initialNode.dado.compareTo(elem);

			if (aux == 0) {

				if (initialNode.esquerda == null) {

					initialNode = initialNode.direita;

				} else if (initialNode.direita == null) {

					initialNode = initialNode.esquerda;

				} else {

					removerNaSubArvore(initialNode);

				}

				b = true;

			} else {

				Node aux2 = initialNode;

				Node aux3 = initialNode;

				while (aux2 != null) {

					aux = aux2.dado.compareTo(elem);

					if (aux == 0) {

						break;

					} else if (aux < 0) {

						aux3 = aux2;

						aux2 = aux2.direita;

					} else {

						aux3 = aux2;

						aux2 = aux2.esquerda;

					}

				}

				if (aux2 != null) {

					if (aux2.esquerda == null) {

						if (aux3.esquerda == aux2) {

							aux3.esquerda = aux2.direita;

						} else {

							aux3.direita = aux2.direita;

						}

					} else if (aux2.direita == null) {

						if (aux3.esquerda == aux2) {

							aux3.esquerda = aux2.esquerda;

						} else {

							aux3.direita = aux2.esquerda;

						}

					} else {

						removerNaSubArvore(aux2);

					}

					b = true;

				}

			}

		}

		if (b == true) {

			posicao--;

		}

	}

	public void removerNaSubArvore(Node raiz) {

		Node aux = raiz.esquerda;

		Node aux2 = raiz;

		while (aux.direita != null) {

			aux2 = aux;

			aux = aux.direita;

		}

		raiz.dado = aux.dado;

		if (aux2 != raiz) {

			aux2.direita = aux.esquerda;

		} else {

			aux2.esquerda = aux.esquerda;

		}

	}

	private String treeSearch(Node actual) {
		if (actual == null) {
			return "(null)";
		}
		if (actual.esquerda == null && actual.direita == null)
			return actual.dado;
		return String.format("l(%s) - %s - r(%s)", treeSearch(actual.esquerda), actual.dado,
				treeSearch(actual.direita));
	}

	public String toString() {

		return treeSearch(initialNode);

	}

}
