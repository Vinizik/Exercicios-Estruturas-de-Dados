package listainvertida;

public class NoLista {

	public int dado;

	public NoLista prox;

	public NoLista ant;

	public NoLista(int d) {

		this.dado = d;

		this.prox = null;

		this.ant = null;

	}

	public void setDado(int dado) {

		this.dado = dado;
	}

	public int getDado() {

		return dado;
	}

	public NoLista getProx() {

		return prox;
	}

	public NoLista getAnt() {

		return ant;
	}

	public void setProx(NoLista prox) {

		this.prox = prox;

	}

	public void setAnt(NoLista ant) {

		this.ant = ant;

	}

}
