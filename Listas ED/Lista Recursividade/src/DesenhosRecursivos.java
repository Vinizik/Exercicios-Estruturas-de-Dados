package listarecursividade;

public class DesenhosRecursivos {

	public static int comecoDasLinhas = 0;
	public static int altura = 0;
	public static int asteriscos = 0;
	public static int espacos = 0;
	public static String desenho = "";
	public static int largura = 1;

	public static String draw(int imageSize, int numberOfAsterisk, int numberOfSpaces) {

		if (altura == imageSize) {

			return desenho;

		}
		if (largura < imageSize) {

			if (comecoDasLinhas == 0) {

				desenho += "|";
				++comecoDasLinhas;
				++largura;

				return draw(imageSize, numberOfAsterisk, numberOfSpaces);

			} else if (asteriscos < numberOfAsterisk) {

				desenho += "*";
				++asteriscos;
				++largura;

				return draw(imageSize, numberOfAsterisk, numberOfSpaces);

			} else if (espacos < numberOfSpaces) {

				desenho += " ";
				++espacos;
				++largura;

				return draw(imageSize, numberOfAsterisk, numberOfSpaces);

			}

			else if (asteriscos == numberOfAsterisk && espacos == numberOfSpaces) {

				asteriscos = 0;
				espacos = 0;

				return draw(imageSize, numberOfAsterisk, numberOfSpaces);
			}

		} else if (largura == imageSize) {

			desenho += "|\n";
			asteriscos = 0;
			espacos = 0;
			++altura;
			comecoDasLinhas = 0;
			largura = 1;

			return draw(imageSize, numberOfAsterisk, numberOfSpaces);
		}

		return desenho;

	}

}
