package numerodefolhas;

public class ArvoreBi<T extends Comparable<T>> {

	public NoBinario<T> raiz;

	public int posicao = 0;

	public ArvoreBi() {

		this.raiz = null;

	}

	public void inserir(T var) {

		if (raiz == null) {

			raiz = new NoBinario<T>(var);

		} else {

			NoBinario<T> aux = raiz;

			while (aux != null) {

				int aux2 = aux.dado.compareTo(var);

				if (aux2 == 0) {

					System.out.print("Ja contido na arvore");

					break;

				} else if (aux2 < 0) {

					if (aux.direita != null) {

						aux = aux.direita;

					} else {

						aux.direita = new NoBinario<T>(var);

						break;

					}

				} else {

					if (aux.esquerda != null) {

						aux = aux.esquerda;

					} else {

						aux.esquerda = new NoBinario<T>(var);

						break;

					}
				}

			}

		}

		posicao++;

	}

}
