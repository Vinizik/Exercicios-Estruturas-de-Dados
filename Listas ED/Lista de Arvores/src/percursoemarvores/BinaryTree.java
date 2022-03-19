package percursoemarvores;

public class BinaryTree {

	public BinaryNode raiz;

	public int posicao = 0;

	public BinaryTree() {

		this.raiz = null;

	}

	public void inserir(int num) {

		if (raiz == null) {

			raiz = new BinaryNode(num);

		} else {

			BinaryNode aux = raiz;

			while (aux != null) {

				if (aux.dado == num) {

					System.out.print("Ja contido na arvore");

					break;

				} else if (aux.dado < num) {

					if (aux.direita != null) {

						aux = aux.direita;

					} else {

						aux.direita = new BinaryNode(num);

						break;
					}
				} else {

					if (aux.esquerda != null) {

						aux = aux.esquerda;

					} else {

						aux.esquerda = new BinaryNode(num);

						break;
					}

				}

			}

		}

		posicao++;

	}

	public void inOrder(BinaryNode no) {

		if (no == null) {

			return;

		}

		inOrder(no.esquerda);

		System.out.print(no.toString() + " ");

		inOrder(no.direita);

	}

	public void preOrder(BinaryNode no) {

		if (no == null) {

			return;

		}

		System.out.print(no.toString() + " ");

		preOrder(no.esquerda);

		preOrder(no.direita);

	}

	public void posOrder(BinaryNode no) {

		if (no == null) {

			return;

		}

		posOrder(no.esquerda);

		posOrder(no.direita);

		System.out.print(no.toString() + " ");

	}

	public void questao() {

		System.out.println("Em ordem: ");

		inOrder(this.raiz);

		System.out.println("\nPre ordem: ");

		preOrder(this.raiz);

		System.out.println("\nPos ordem: ");

		posOrder(this.raiz);

	}

}
