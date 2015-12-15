package uebungsblatt9;

public class CountStack extends Stack {

	int pushCounter;
	
	CountStack(int size) {
		super(size);
		this.pushCounter = 0;
		
	}

	boolean push(int value) {
		if (!this.isFull()) {
			this.store[++this.current] = value;
			this.pushCounter +=1;
			return true;
		}
		return false;
	}

	
	public int getNumberOfValidPushOperations() {	
		return this.pushCounter;
	}

}
