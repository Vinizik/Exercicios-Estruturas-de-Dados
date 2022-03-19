package mensagensecretas;

public class Result {

	static HashtableEndFechado hashtable = new HashtableEndFechado(24);

	public static String encrypt(String dictionary, String phrase) {

		String result = "";

		String[] dict = dictionary.split(" ");

		for (String item : dict) {

			hashtable.inserir(item);

			hashtable.inserir(" -0");

		}

		String str = phrase.toLowerCase();

		for (int i = 0; i < str.length(); i++) {

			result += hashtable.numeroCorrespondente(str.charAt(i));

		}

		return result;

	}

}
