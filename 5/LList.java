/*
	Question 5
	Creator: Wahid Bawa
	Purpose: To create a method for removing duplicates to implement within a linked list class
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

	public void delete(LNode node) {
		if (node == head) {
			head = node.getNext();
		}
		if (node == tail) {
			tail = node.getPrev();
		}
		if (node.getNext() != null) {
			node.getNext().setPrev(node.getPrev());
		}
		if (node.getPrev() != null) {
			node.getPrev().setNext(node.getNext());
		}
	}

	public boolean contains(int val) { // this checks if a value is present in the list, returns true or false
		boolean found = false;
		LNode tmp = head;
		while (tmp != null) {
			if (tmp.getVal() == val) {
				found = true;
				break;
			}
			tmp = tmp.getNext();
		}
		return found;
	}

	public void removeDuplicates() {
		LNode tmp = head;
		LList singles = new LList(); // creating a linkedlist of unique values in the original list
		while (tmp != null) {
			if (singles.contains(tmp.getVal())) { // If the value is not unique, delete it
				delete(tmp);
			}
			else { // Count is as unique
				singles.add(tmp.getVal());
			}
			tmp = tmp.getNext();
		}
	}
}