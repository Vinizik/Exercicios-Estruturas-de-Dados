package listainvertida;

public class ListaDinamicaInvertida {

	private NoLista primeiro;

	public ListaDinamicaInvertida() {

		this.primeiro = null;

	}

	public void add(int numero) {

		NoLista inserido = new NoLista(numero);

		NoLista aux = null;

		inserido.setProx(null);

		if (primeiro == null) {

			primeiro = inserido;

			return;
		} else {

			aux = primeiro;

			while (aux.getProx() != null) {

				aux = aux.getProx();

			}

		}

		aux.setProx(inserido);

	}

	public void print() {

		String r = "";

		if (primeiro == null) {

			System.out.print("Lista vazia");

		} else {

			NoLista aux = primeiro;

			while (aux != null) {

				r += aux.getDado() + " ";

				aux = aux.getProx();

			}

		}
		System.out.print(r);

	}

	public void inverterLista() {

		NoLista prox = null;

		NoLista ant = null;

		NoLista aux = primeiro;

		while (aux != null) {

			prox = aux.getProx();

			aux.setProx(ant);

			ant = aux;

			aux = prox;

		}

		primeiro = ant;

	}

	public void removerIguais() {

		NoLista aux1 = null;

		NoLista aux2 = null;

		NoLista numeroRepetido = null;

		aux1 = primeiro;

		while (aux1 != null && aux1.getProx() != null) {

			aux2 = aux1;

			while (aux2.getProx() != null) {

				if (aux1.getDado() == aux2.getProx().getDado()) {

					numeroRepetido = aux2.getProx();

					aux2.setProx(aux2.getProx().getProx());

				} else {

					aux2 = aux2.getProx();

				}

			}

			aux1 = aux1.getProx();
		}

	}

	public ListaDinamicaInvertida listaNova() {

		this.inverterLista();

		this.removerIguais();

		return this;

	}

}
