package listarecursividade;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class BasesDecimais {

	public static int somatorio = 0;
	
	public static int valorExpoente;
	
	public static int posicaoString = 0;

	public static int convertToDecimal(String inputNumber, int base) {

		valorExpoente = (inputNumber.length() - 1) - posicaoString;

		if (inputNumber.length() < 1) {

			return 0;
			
		}

		else if (posicaoString == inputNumber.length()) {

			return somatorio;
			
		}

		else {
			
			int numero = aux(inputNumber, base);

			return convertToDecimal(inputNumber, base);
		}

	}

	public static int aux(String inputNumber, int base) {
		
		if (inputNumber.charAt(posicaoString) >= 65 && inputNumber.charAt(posicaoString) <= 90) {
			
			int numero = inputNumber.charAt(posicaoString) - 55;
			
			somatorio += numero * (Math.pow(base, valorExpoente));
			
			posicaoString++;

			return numero;

		} else {
			
			String letra = Character.toString(inputNumber.charAt(posicaoString));
			
			int valor = Integer.parseInt(letra);
			
			somatorio += valor * (Math.pow(base, valorExpoente));
			
			posicaoString++;

			return convertToDecimal(inputNumber, base);

		}
		
	}
	
}
