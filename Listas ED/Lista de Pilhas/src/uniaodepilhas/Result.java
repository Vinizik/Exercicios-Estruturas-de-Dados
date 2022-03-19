package uniaodepilhas;

public class Result {

	public static Stack createStack(String phrase) {
		Stack rStack = new Stack();
		String[] inputs = phrase.split(" ");
		for (String input : inputs) {
			rStack.push(input);
		}

		return rStack;

	}

	public static void joinStacks(Stack stackA, Stack stackB) {

		Stack auxPilha = new Stack();

		while (stackB.size() != 0) {

			auxPilha.push(stackB.pop());

		}

		while (stackA.size() != 0) {

			auxPilha.push(stackA.pop());

		}

		while (auxPilha.size() != 0) {

			stackB.push(auxPilha.pop());

		}

		while (stackB.size() != 0) {

			stackA.push(stackB.pop());

		}

	}

}
