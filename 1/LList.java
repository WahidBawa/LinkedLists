/*
	Creator: Wahid Bawa
	Purpose: To create a singly linked list
*/
public class LList {
	private LNode head;

	public LList() {
		head = null;
	}

	// Adds node to the head of the list
	public void add(int val) {
		LNode tmp = new LNode(val, head);
		head = tmp;
	}

	public String toString() {
		String ans = "";
		LNode tmp = head;
		while (tmp != null) {
			ans += tmp.getVal() + (tmp.getNext() == null ? "" : "->");
			tmp = tmp.getNext();
		}
		return ans;
	}

	// Another name for add.
	public void push(int val) { add(val); }

	// Removes and returns the value of the first element in the list
	public int pop() {
		LNode tmp = head;
		head = tmp.getNext();
		return tmp.getVal();
	}
}