package percursoemarvores;

public class Solution {

	public static void addArvore(String entrada, BinaryTree a) {

		String[] str = entrada.split(",");

		for (String item : str) {

			a.inserir(Integer.parseInt(item));

		}

	}

}
