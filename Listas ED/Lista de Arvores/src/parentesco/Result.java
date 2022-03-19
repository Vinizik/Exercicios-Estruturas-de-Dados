package parentesco;

public class Result {

	public static String nodeGenealogy(String values, String nodeA, String nodeB) {

		String result = "";

		ArvoreBinaria<String> arvore = new ArvoreBinaria<String>();

		String[] str = values.split(" ");

		for (String item : str) {

			arvore.inserir(item);

		}

		int valor = (arvore.checarProfundidade(nodeA) - arvore.checarProfundidade(nodeB));

		valor = Math.abs(valor);

		if (arvore.checarFolha(nodeA) == 1 && arvore.checarFolha(nodeB) == 1) {

			result = "nao ha parentesco";

		} else if (!(arvore.checarNode(nodeA) && arvore.checarNode(nodeB))) {

			result = "nao ha parentesco";

		} else if (valor == 0) {

			result = "nao ha parentesco";

		} else if (valor >= 1) {

			result = "Pai";

			for (int i = 1; i < valor; i++) {

				result += " do Pai";

			}

		} else {

			result = "nao ha parentesco";

		}

		return result;

	}

}
