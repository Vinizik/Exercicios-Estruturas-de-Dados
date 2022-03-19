package arvoresbalanceadas;

public class Result {

	static ArvoreBinaria arvore = new ArvoreBinaria();

	static String result = "";

	public static String NodeInformation(String values) {

		result = arvore.isBalanced(values);

		return result;

	}

}
