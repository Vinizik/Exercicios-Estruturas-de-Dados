package arvoresavl;

public class Result {

	static BinaryTree<Integer> arvore = new BinaryTree<Integer>();

	public static void addToTree(String values) {

		String[] str = values.split(" ");

		for (String item : str) {

			arvore.add(Integer.parseInt(item));

		}

	}

	public static String printTree() {

		return arvore.toString();

	}

}
