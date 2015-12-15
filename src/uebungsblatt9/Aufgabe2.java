package uebungsblatt9;

public class Aufgabe2 {

	// Testprogramm
	public static void main(String[] args) {
		VList list = new VList();
		list.append(5);
		list.append(4);
		list.append(3);
		list.append(4);
		list.append(4);
		list.append(2);
		list.append(2);
		list.append(1);
		list.print();
		list.verdoppeln(4);
		list.print();

	}
}
