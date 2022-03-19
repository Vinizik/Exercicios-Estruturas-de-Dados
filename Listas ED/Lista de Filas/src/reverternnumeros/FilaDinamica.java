package reverternnumeros;

public class FilaDinamica {

	public NoFila primeiro;

	public NoFila ultimo;

	public int posicao = 0;

	public FilaDinamica() {

		this.primeiro = null;

		this.ultimo = null;

	}

	public void add(int str) {

		NoFila inserido = new NoFila(str);

		if (primeiro == null) {

			primeiro = ultimo = inserido;

		} else {

			ultimo.prox = inserido;

			ultimo = inserido;

		}

		posicao++;

	}

	public void print() {

		String r = "";

		if (primeiro == null)
			System.out.print("Fila vazia");

		else {

			NoFila aux = primeiro;

			while (aux != null) {

				r += aux.dado + " ";

				aux = aux.prox;

			}

		}
		System.out.print(r);

	}

	public int remover() {

		int r = 0;

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

	public int peek() {

		return primeiro.dado;

	}

	public void reverterFila(int n) {

		int[] aux = new int[n];

		int[] aux2 = new int[posicao - n];

		for (int i = 0; i < n; i++) {

			aux[i] = this.remover();

		}

		for (int i = 0; i < aux2.length; i++) {

			aux2[i] = this.remover();

		}

		for (int i = aux.length - 1; i >= 0; i--) {

			this.add(aux[i]);

		}

		for (int i : aux2) {

			this.add(i);

		}

	}

}
