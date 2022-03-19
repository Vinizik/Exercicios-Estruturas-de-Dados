package binarios;

public class Solution {

	public static String conversaoBinario(int valor) {

		int aux[] = new int[35]; // tamanho do array equivalente a 36 bits

		int contador = 0;

		while (valor > 0) {

			aux[contador++] = valor % 2;

			valor = valor / 2;

		}

		String str = "";

		for (int i = contador - 1; i >= 0; i--) {

			str += aux[i];

		}

		return str;

	}

	public static FilaDinamica<String> numerosBinarios(int n) {

		FilaDinamica<String> fila = new FilaDinamica<String>();

		for (int i = 1; i <= n; i++) {

			String numeroBinario = conversaoBinario(i);

			if (numeroBinario != null) {

				fila.inserir(numeroBinario);

			}

		}

		return fila;

	}

}
