package arvoresavl;

public class BinaryTree<T extends Comparable<T>> {

	private Node<T> initialNode;

	public int posicao = 0;

	public BinaryTree() {

		this.initialNode = null;

	}

	public void add(T elem) {

		Node<T> novo = new Node<T>(elem);

		if (initialNode == null) {

			initialNode = novo;

		} else {

			Node<T> aux = initialNode;

			while (aux != null) {

				int aux2 = aux.dado.compareTo(elem);

				if (aux2 == 0) {

					System.out.print("Ja contido na arvore");

				} else if (aux2 < 0) {

					if (aux.direita != null) {

						aux = aux.direita;

					} else {

						aux.direita = novo;

						break;

					}

				} else {

					if (aux.esquerda != null) {

						aux = aux.esquerda;

					} else {

						aux.esquerda = novo;

						break;

					}

				}

			}

		}

		checarArvoreAVL(novo);

		posicao++;

	}

	public int checarAltura(Node<T> no) {

		if (no == null) {

			return -1;

		} else {

			return no.altura;

		}

	}

	public void definirAltura(Node<T> no) {

		no.altura = 1 + Math.max(checarAltura(no.esquerda), checarAltura(no.direita));

	}

	public int checarBalanceamento(Node<T> no) {

		if (no == null) {

			return 0;

		} else {

			return (checarAltura(no.direita) - checarAltura(no.esquerda));

		}

	}

	public void checarArvoreAVL(Node<T> no) {

		if (Math.abs(checarBalanceamento(no)) > 1) {

			balancearArvore(no);

		}

	}

	public Node<T> rotacaoAEsquerda(Node<T> y) {

		Node<T> x = y.direita;

		Node<T> z = x.esquerda;

		x.esquerda = y;

		y.direita = z;

		definirAltura(y);

		definirAltura(x);

		return x;

	}

	public Node<T> rotacaoADireita(Node<T> y) {

		Node<T> x = y.esquerda;

		Node<T> z = x.direita;

		x.direita = y;

		y.esquerda = z;

		definirAltura(y);

		definirAltura(x);

		return x;

	}

	public Node<T> balancearArvore(Node<T> no) {

		definirAltura(no);

		int aux = checarBalanceamento(no);

		if (aux > 1) {

			if (checarAltura(no.direita.direita) > checarAltura(no.direita.esquerda)) {

				no = rotacaoAEsquerda(no);

			} else {

				no.direita = rotacaoADireita(no.direita);

				no = rotacaoAEsquerda(no);

			}

		} else if (aux < -1) {

			if (checarAltura(no.esquerda.esquerda) > checarAltura(no.esquerda.direita)) {

				no = rotacaoADireita(no);

			} else {

				no.esquerda = rotacaoAEsquerda(no.esquerda);

				no = rotacaoADireita(no);

			}

		}

		return no;

	}

	private String treeSearch(Node actual) {
		if (actual == null) {
			return "(null)";
		}
		if (actual.esquerda == null && actual.direita == null)
			return actual.dado.toString();
		return String.format("l(%s) - %s - r(%s)", treeSearch(actual.esquerda), actual.dado,
				treeSearch(actual.direita));
	}

	public String toString() {
		return treeSearch(initialNode);
	}
}
