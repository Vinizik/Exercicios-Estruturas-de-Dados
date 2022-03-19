package numerodefolhas;

public class Result {

	public static int numDeFolhas = 0;

	public static void contaFolhaAux(NoBinario<String> no) {

		if (no == null) {

			return;

		} else if (no.esquerda == null && no.direita == null) {

			numDeFolhas++;

		} else {

			contaFolhaAux(no.esquerda);

			contaFolhaAux(no.direita);

		}

	}

	public static int contaFolha(String a, ArvoreBi<String> arvore) {

		String[] str = a.split(" ");

		for (String item : str) {

			arvore.inserir(item);

		}

		contaFolhaAux(arvore.raiz);

		return numDeFolhas;

	}

}
