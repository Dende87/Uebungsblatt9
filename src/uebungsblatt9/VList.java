package uebungsblatt9;

public class VList extends List {

	public void verdoppeln(int i) {

		Element elem = this.first;
		while (elem.next != null) {
			if(elem.value == i){
				Element newElem = new Element(i, elem.next);
				elem.next = newElem;
				elem = elem.next;
			}
			elem = elem.next;
		}

	}

}
