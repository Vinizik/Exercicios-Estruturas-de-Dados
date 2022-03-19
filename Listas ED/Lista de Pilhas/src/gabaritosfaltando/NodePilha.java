package gabaritosfaltando;

public class NodePilha {

	public NodePilha prox;

	public NodePilha ant;

	public String dado;

	public NodePilha(String dado) {

		this.prox = null;

		this.dado = dado;

		this.ant = null;

	}

}
