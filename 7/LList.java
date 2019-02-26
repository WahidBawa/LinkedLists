/*
	Creator: Wahid Bawa
	Purpose: To create a clone method to clone a preexisting linked list on to an empty linked list
*/
public class LList {
	private LNode head, tail;

	public LList() {
		head = null;
		tail = null;
	}

	public void add(int val) {
		LNode tmp = new LNode(val, tail, null);
		if (tail != null) {
			tail.setNext(tmp);
		}
		if (head == null) {
			head = tmp;
		}
		tail = tmp;
	}

	public String toString() { // displays the parts of the linked list
		String ans = "";
		LNode tmp = head;
		while (tmp != null) {
			ans += tmp.getVal() + (tmp.getNext() == null ? "" : "-");
			tmp = tmp.getNext();
		}
		return ans;
	}

	public LList clone() { // creates and returns a copy of the list
		LList newList = new LList();
		LNode tmp = head;
		while (tmp != null) { // loops through all existing values and adds them
			newList.add(tmp.getVal());
			tmp = tmp.getNext();
		}
		return newList;
	}
}