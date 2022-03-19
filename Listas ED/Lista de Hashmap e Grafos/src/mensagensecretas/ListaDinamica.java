package mensagensecretas;

public class ListaDinamica {

	public NoLista elementos;

	public int posicao = 0;

	public void inserir(String str) {

		if (isEmpty()) {

			elementos = new NoLista(str);

		} else {

			NoLista aux = elementos;

			while (aux.prox != null) {

				aux = aux.prox;

			}

			aux.prox = new NoLista(str);

		}

		posicao++;

	}

	public boolean consultar(String str) {

		boolean r = false;

		NoLista aux = elementos;

		while (aux != null) {

			if (aux.dado.equals(str)) {

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

}
