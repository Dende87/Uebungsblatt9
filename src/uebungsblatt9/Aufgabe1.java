package uebungsblatt9;

public class Aufgabe1 {

	// Testprogramm
	public static void main(String[] args) {
		CountStack stack = new CountStack(4);
		while (!stack.isFull()) {
			stack.push(IO.readInt("Eingabe: "));
		}
		stack.push(47);
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		while (!stack.isFull()) {
			stack.push(IO.readInt("Eingabe: "));
		}
		System.out.println("Gueltige PUSH-Operationen: " + stack.getNumberOfValidPushOperations());
		// Ausgabe sollte 8 sein!
	}

}
