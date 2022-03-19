package uniaodeconjuntos;

public class Conjuntos {

	public static Lista lista = new Lista();

	public static boolean contem(String[] vetor, String valor) {

		for (String item : vetor) {

			if (item.equals(valor)) {

				return true;
			}
		}

		return false;
	}

	public static String uniaoConjuntos(String conj1, String conj2) {

		String[] conj1Elementos = conj1.split(" ");
		String[] conj2Elementos = conj2.split(" ");

		for (String e1 : conj1Elementos) {

			lista.inserir(e1);

		}

		for (String e2 : conj2Elementos) {

			if (!contem(conj1Elementos, e2)) {

				lista.inserir(e2);

			}

		}

		return lista.toString();

	}

}
