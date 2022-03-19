package textosequencial;

public class NoPilha {
	
	public NoPilha prox;

	public NoPilha ant;

	public String dado;

	public NoPilha(String dado) {

		this.prox = null;

		this.dado = dado;

		this.ant = null;

	}

}
