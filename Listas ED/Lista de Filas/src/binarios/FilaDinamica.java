package binarios;

public class FilaDinamica<T> {

	public NoFila<T> primeiro;

	public NoFila<T> ultimo;

	public int posicao = 0;

	public FilaDinamica() {

		this.primeiro = null;

		this.ultimo = null;

	}

	public void inserir(T dado) {

		NoFila<T> inserido = new NoFila<T>(dado);

		if (primeiro == null) {

			primeiro = ultimo = inserido;

		} else {

			ultimo.prox = inserido;

			ultimo = inserido;
		}

		posicao++;

	}

	public T remover() {

		T r = null;

		if (posicao > 0) {

			r = primeiro.dado;

			primeiro = primeiro.prox;

			if (primeiro == null) {

				ultimo = null;

			}

			posicao--;

		}

		return r;

	}

	public void print() {

		String str = "";

		NoFila<T> aux = primeiro;

		while (aux != null) {

			str += aux.dado + " ";

			aux = aux.prox;

		}

		System.out.print(str);

	}

}
