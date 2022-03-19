package nomesrepetidos;

public class NomesRepetidos {

	public static ImplementedList lista = new ImplementedList();

	public static int attendance(String value) {

		String[] nomes = value.split("\n");

		for (String nome : nomes) {

			if (!lista.contem(nome)) {

				lista.adicionar(nome);

				lista.listaCheia();

			}
		}

		return lista.posicao;
	}

}
