package removernos;

public class Result {

	private final static BinaryTree tree = new BinaryTree();

	public static void createTree(String values) {
		String[] valuesToAdd = values.split(" ");
		for (String value : valuesToAdd) {
			tree.add(value);
		}
	}

	public static String removeNodes(String removeValues) {

		String[] valoresRemovidos = removeValues.split(" ");

		for (String item : valoresRemovidos) {

			tree.remover(item);

		}

		return tree.toString();

	}

}
