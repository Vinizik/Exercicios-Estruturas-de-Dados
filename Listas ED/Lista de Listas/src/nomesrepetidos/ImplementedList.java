package nomesrepetidos;

public class ImplementedList {

	String[] nomeDosAlunos = new String[1];

	int posicao = 0;

	public void listaCheia() {

		if (nomeDosAlunos.length == posicao) {

			String[] aux = new String[posicao * 2];

			for (int i = 0; i < posicao; i++) {

				aux[i] = nomeDosAlunos[i];

			}
			nomeDosAlunos = aux;
		}
	}

	public boolean contem(String nome) {

		boolean aux = false;

		String[] sobrenomes = nome.split(" ");

		for (String elemento : nomeDosAlunos) {

			if (elemento != null) {

				for (String sobrenome : sobrenomes) {

					String aux2;
					String aux3;

					aux2 = sobrenome.toLowerCase();
					aux3 = elemento.toLowerCase();

					if (aux3.contains(aux2)) {

						aux = true;

					} else {

						aux = false;

						break;

					}

				}

			}

		}

		return aux;

	}

	public void adicionar(String nome) {

		nomeDosAlunos[posicao] = nome;

		posicao++;
	}

}
