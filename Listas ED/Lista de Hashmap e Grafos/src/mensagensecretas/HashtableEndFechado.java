package mensagensecretas;

public class HashtableEndFechado {

	public ListaDinamica[] tabela;

	public int tamanho = 0;

	public HashtableEndFechado(int n) {

		tabela = new ListaDinamica[n];

		for (int i = 0; i < tabela.length; i++) {

			tabela[i] = new ListaDinamica();

		}
		
	}

	public int hashing(String str) {

		return str.hashCode() % tabela.length;

	}

	public void inserir(String str) {

		int h = hashing(str.charAt(0) + "");

		if (tabela[h].consultar(str) == false) {

			tamanho++;

			tabela[h].inserir(str);

		}

	}

	public String numeroCorrespondente(char c) {

		String str = "";

		String s = Character.toString(c);

		int h = hashing(s);

		NoLista aux = tabela[h].elementos;

		for (int i = 0; i < tabela[h].posicao; i++) {

			String[] r = aux.dado.split("-");

			if (r[0].equals(s)) {

				str = r[1] + " ";

			} else {

				aux = aux.prox;

			}

		}

		return str;

	}

}
