package uebungsblatt9;

class Stack {

	int[] store; // zum Speichern von Daten
	int current; // aktueller Index

	Stack(int size) {
		this.store = new int[size];
		this.current = -1;
	}

	boolean isFull() {
		return this.current == this.store.length - 1;
	}

	boolean isEmpty() {
		return this.current == -1;
	}

	boolean push(int value) {
		if (!this.isFull()) {
			this.store[++this.current] = value;
			return true;
		}
		return false;
	}

	int pop() {
		if (!this.isEmpty()) {
			return this.store[this.current--];
		}
		return 0; // Fehler! Wird spaeter via Exceptions gehandhabt
	}
}