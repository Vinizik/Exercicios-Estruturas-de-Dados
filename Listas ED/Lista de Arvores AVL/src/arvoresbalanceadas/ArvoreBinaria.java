package arvoresbalanceadas;

public class ArvoreBinaria {

	public NoBinario raiz;

	public int posicao = 0;

	public ArvoreBinaria() {

		this.raiz = null;

	}

	public void inserir(String str) {

		if (raiz == null) {

			raiz = new NoBinario(str);

		} else {

			NoBinario aux = raiz;

			while (aux != null) {

				int aux2 = aux.dado.compareTo(str);

				if (aux2 < 0) {

					if (aux.direita != null) {

						aux = aux.direita;

					} else {

						aux.direita = new NoBinario(str);

						break;

					}

				} else {

					if (aux.esquerda != null) {

						aux = aux.esquerda;

					} else {

						aux.esquerda = new NoBinario(str);

						break;
					}

				}

			}

		}

		posicao++;

	}

	public int checarAltura(NoBinario no) {

		if (no != null) {

			int alturaFilhoEsq = checarAltura(no.esquerda);

			int alturaFilhoDir = checarAltura(no.direita);

			int alturaP;

			if (alturaFilhoEsq > alturaFilhoDir) {

				alturaP = alturaFilhoEsq + 1;

			} else {

				alturaP = alturaFilhoDir + 1;

			}

			return alturaP;

		} else {

			return -1;

		}

	}

	public boolean isBalancedAux(NoBinario no) {

		int alturaFilhoEsq;

		int alturaFilhoDir;

		boolean b = false;

		if (no == null) {

			b = true;

			return b;

		}

		alturaFilhoEsq = checarAltura(no.esquerda);

		alturaFilhoDir = checarAltura(no.direita);

		if (Math.abs(alturaFilhoEsq - alturaFilhoDir) <= 1 && isBalancedAux(no.esquerda) && isBalancedAux(no.direita)) {

			b = true;

			return b;

		} else {

			b = false;

			return b;

		}

	}

	public String isBalanced(String values) {

		String str = "";

		String[] add = values.split(" ");

		for (String item : add) {

			inserir(item);

		}

		if (isBalancedAux(raiz) == true) {

			str = "E balanceada";

		} else {

			str = "Nao e balanceada";

		}

		return str;

	}

}
