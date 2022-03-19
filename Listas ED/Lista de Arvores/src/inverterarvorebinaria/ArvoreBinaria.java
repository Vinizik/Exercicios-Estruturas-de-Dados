package inverterarvorebinaria;

public class ArvoreBinaria<T extends Comparable<T>> {

	public No<T> raiz;

	public int posicao = 0;

	public ArvoreBinaria() {

		this.raiz = null;

	}

	public void add(T e) {

		if (raiz == null) {

			raiz = new No<T>(e);

		} else {

			No<T> aux = raiz;

			while (aux != null) {

				int aux2 = aux.dado.compareTo(e);

				if (aux2 == 0) {

					System.out.print("Ja contido na arvore");

					break;

				} else if (aux2 < 0) {

					if (aux.direita != null) {

						aux = aux.direita;

					} else {

						aux.direita = new No<T>(e);

						break;

					}

				} else {

					if (aux.esquerda != null) {

						aux = aux.esquerda;

					} else {

						aux.esquerda = new No<T>(e);

						break;

					}
				}

			}

		}

		posicao++;

	}

	public void inverterArvore() {

		inverter(raiz);

	}

	public void percursoEmOrdem() {

		emOrdem(raiz);

	}

	public void emOrdem(No<T> no) {

		if (no == null) {

			return;

		}

		emOrdem(no.esquerda);

		System.out.print(no.dado + " ");

		emOrdem(no.direita);

	}

	public void inverter(No<T> no) {

		if (no == null) {

			return;

		}

		No<T> aux = no.esquerda;

		no.esquerda = no.direita;

		no.direita = aux;

		inverter(no.esquerda);

		inverter(no.direita);

	}

}
