package listarecursividade;

public class CebolinhaString {

	public static String frasecomr = "";
	public static int posicao = 0;

	public static String substituir(String s, char problema, char solucao) {
		if (s.length() == frasecomr.length()) {
			return frasecomr;

		} else if (s.charAt(posicao) == problema) {
			frasecomr += solucao;
			posicao = posicao + 1;
			return substituir(s, problema, solucao);
		} else {
			frasecomr += s.charAt(posicao);
			posicao = posicao + 1;
			return substituir(s, problema, solucao);
		}

	}

}
