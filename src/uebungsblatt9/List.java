package uebungsblatt9;

class Element {
	int value; // Speicher fuer einen Wert
	Element next; // Referenz auf das folgende Element (oder null fuer Ende)

	Element(int v, Element n) {
		this.value = v;
		this.next = n;
	}
}

class List {
	Element first; // erstes Element der Liste
	Element last; // letztes Element der Liste

	List() {
		this.first = null;
		this.last = null;
	}

	void append(int i) {
		Element elem = new Element(i, null);
		if (this.first == null) { // erstes Element in der Liste
			this.first = elem;
			this.last = elem;
		} else { // Anhaengen des Elementes am Ende
			this.last.next = elem;
			this.last = elem;
		}
	}

	void print() {
		Element elem = this.first;
		while (elem != null) {
			System.out.print(elem.value);
			if (elem.next != null) {
				System.out.print(" -> ");
			}
			elem = elem.next;
		}
		System.out.println();
	}
}
