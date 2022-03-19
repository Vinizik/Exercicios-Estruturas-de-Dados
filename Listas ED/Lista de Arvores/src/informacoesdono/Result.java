package informacoesdono;

public class Result {

	public static String nodeInformation(String values, String nodeValue) {

		String result = "";

		ArvoreBinaria<String> arvore = new ArvoreBinaria<String>();

		String[] str = values.split(" ");

		for (String item : str) {

			arvore.inserir(item);

		}

		if (arvore.checarNode(nodeValue) == false) {

			result = "-1" + " " + "-1";

		} else {

			result += arvore.checarProfundidade(nodeValue) + " " + arvore.checarFolha(nodeValue);

		}

		return result;

	}

}
