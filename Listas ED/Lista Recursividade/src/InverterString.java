package listarecursividade;

public class InverterString {

	static String fraseinvertida = "";

	public static String fun(String s) {

		if (s.length() == fraseinvertida.length()) {
			return fraseinvertida;

		} else {
			fraseinvertida += s.charAt(s.length() - (fraseinvertida.length() + 1));
			return fun(s);
		}

	}

}
