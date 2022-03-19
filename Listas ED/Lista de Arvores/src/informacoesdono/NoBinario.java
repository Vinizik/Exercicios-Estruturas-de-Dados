package informacoesdono;

public class NoBinario<T> {

	public T dado;

	public NoBinario<T> esquerda;

	public NoBinario<T> direita;

	public NoBinario(T dado) {

		this.dado = dado;

		this.esquerda = null;

		this.direita = null;

	}

}
