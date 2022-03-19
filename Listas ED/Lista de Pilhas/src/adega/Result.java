package adega;

public class Result {

	public static Pilha<Vinho> ordenarPorAno(Pilha<Vinho> adega) {

		Pilha<Vinho> pAuxiliar = new Pilha<Vinho>();

		while (adega.size() != 0) {

			Vinho aux2 = adega.pop();

			int aux = aux2.ano;

			while (pAuxiliar.size() != 0 && pAuxiliar.top().ano > aux) {

				adega.push(pAuxiliar.pop());

			}

			pAuxiliar.push(aux2);

		}

		return pAuxiliar;

	}

	public static String ocasiaoEspecial(Pilha<Vinho> adega) {

		adega = ordenarPorAno(adega);

		Vinho aux1 = adega.pop();

		return aux1.nome + "(" + aux1.ano + ")";

	}

	public static Pilha<Vinho> inserirVinho(Pilha<Vinho> adega, Vinho novo) {

		adega.push(novo);

		return adega;

	}

}
