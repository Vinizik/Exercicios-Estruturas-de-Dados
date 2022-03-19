package implementarfila;

public class Fila<T> {

	public T[] items;

	public int posicao;

	public int atras;

	public int frente;

	public Fila(int size) {

		this.items = (T[]) new Object[size];

		this.posicao = 0;

		this.frente = 0;

		this.atras = -1;

	}

	public T remover() {

		T r = null;

		r = items[frente];

		items[frente] = null;

		frente = (frente + 1) % items.length;

		posicao--;

		return r;

	}

	public boolean inserir(T e) {

		if (posicao < items.length) {

			atras = (atras + 1) % items.length;

			items[atras] = e;

			posicao++;

			return true;

		}

		return false;

	}

	public T peek() {

		return items[frente];

	}

	public String imprimirFila() {

		String str = "";

		for (int i = 0; i < posicao; i++) {

			str += items[(i + frente) % items.length] + " ";

		}

		return str;

	}

}
