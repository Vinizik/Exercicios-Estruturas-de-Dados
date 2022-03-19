package parentesco;

public class ArvoreBinaria<T extends Comparable<T>> {

	public NoBinario<T> raiz;

	public int posicao = 0;

	public ArvoreBinaria() {

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

	public int checarProfundidade(T var) {

		int profundidade = 0;

		NoBinario<T> aux = raiz;

		while (aux != null) {

			int aux2 = aux.dado.compareTo(var);

			if (aux2 == 0) {

				break;

			} else if (aux2 < 0) {

				aux = aux.direita;

				profundidade++;

			} else {

				aux = aux.esquerda;

				profundidade++;

			}

		}

		return profundidade;

	}

	public int checarFolha(T var) {

		int valor = 0;

		NoBinario<T> aux = raiz;

		while (aux != null) {

			int aux2 = aux.dado.compareTo(var);

			if (aux2 == 0) {

				if (aux.esquerda == null && aux.direita == null) {

					valor = 1;

				}

				break;

			} else if (aux2 < 0) {

				aux = aux.direita;

			} else {

				aux = aux.esquerda;

			}

		}

		return valor;

	}

	public boolean checarNode(T var) {

		boolean b = false;

		NoBinario<T> aux = raiz;

		while (aux != null) {

			int aux2 = aux.dado.compareTo(var);

			if (aux2 == 0) {

				b = true;

				break;

			} else if (aux2 < 0) {

				aux = aux.direita;

			} else {

				aux = aux.esquerda;

			}

		}

		return b;

	}

}
