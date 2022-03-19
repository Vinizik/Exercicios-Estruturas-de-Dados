package grafosexplicitos;

public class ImplementedList<T> {

	public NoLista<T> elementos;

	public int posicao = 0;

	public void inserir(T var) {

		if (isEmpty()) {

			elementos = new NoLista<T>(var);

		} else {

			NoLista<T> aux = elementos;

			while (aux.prox != null) {

				aux = aux.prox;

			}

			aux.prox = new NoLista<T>(var);

		}

		posicao++;

	}

	public boolean consultarVertex(T var) {

		boolean r = false;

		NoLista<T> aux = elementos;

		while (aux != null) {

			if (aux.compararVertex(var)) {

				r = true;

				break;

			} else {

				aux = aux.prox;

			}

		}

		return r;

	}

	public boolean consultarEdges(T var) {

		boolean r = false;

		NoLista<T> aux = elementos;

		while (aux != null) {

			if (aux.compararEdges(var)) {

				r = true;

				break;

			} else {

				aux = aux.prox;

			}

		}

		return r;

	}

	public boolean isEmpty() {

		return posicao == 0;

	}

	public int size() {

		return posicao;

	}

	public T get(int val) {

		if (val > posicao - 1) {

			return null;

		}

		NoLista<T> aux = elementos;

		for (int i = 0; i < val; i++) {

			aux = aux.prox;

		}

		return aux.dado;

	}

}
