/*
	Creator: Wahid Bawa
	Purpose: To add a reverse method which would reverse the contents of a linked list
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

	public void reverse() { // reverses the order of the nodes
		LNode tmp, nextTmp;
		tmp = head;
		while (tmp != null) {
			nextTmp = tmp.getNext(); // this is the temp variable for the next node, this is for keeping track of this node after we lose it
			tmp.setNext(tmp.getPrev());
			tmp.setPrev(nextTmp);
			tmp = tmp.getPrev();
		}

		// switch head and tail
		tmp = head;
		head = tail;
		tail = tmp;
	}
}
