package gincanaescolar;

public class Gincana {

	public static String[] nomes = new String[1];
	public static int posicao = 0;

	public static void listaCheia() {

		if (nomes.length == posicao) {

			String[] aux = new String[posicao * 2];

			for (int i = 0; i < posicao; i++) {

				aux[i] = nomes[i];
			}
			nomes = aux;
		}

	}

	public static void addToOrderedList(String value) {

		listaCheia();
		nomes[posicao] = value;
		posicao++;
		nomes = ordenarNomes(nomes, posicao);

	}

	public static String[] ordenarNomes(String[] nomes, int posicao) {

		for (int i = 0; i < posicao; i++) {

			for (int j = i + 1; j < posicao; j++) {

				if (nomes[j].compareTo(nomes[i]) < 0) {
					String aux = nomes[i];
					nomes[i] = nomes[j];
					nomes[j] = aux;
				}
			}
		}

		return nomes;
	}

	public static String orderedListToString() {
		String r = "";
		for (int i = 0; i < posicao; i++) {
			r += nomes[i] + "\n";

		}
		System.out.println(r);
		return r;
	}

}
