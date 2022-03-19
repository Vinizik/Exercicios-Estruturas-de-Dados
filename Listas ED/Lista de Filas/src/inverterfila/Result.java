package inverterfila;

public class Result {

	public static Queue invertQueue(String input) {

		Queue fila = new Queue();

		String[] str = input.split(" ");

		for (int i = 0; i < str.length; i++) {

			fila.enqueue(str[i]);

		}

		for (int i = 0; i < str.length; i++) {

			str[i] = fila.dequeue();

		}

		for (int i = str.length - 1; i >= 0; i--) {

			fila.enqueue(str[i]);

		}

		return fila;

	}

}
