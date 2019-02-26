/*
	Question 1
	Creator: Wahid Bawa
	Purpose: To create a node which will be implemented within a linked list class
*/
public class LNode {
	private int val;
	private LNode next;
	public LNode(int val, LNode next) {
		this.val = val;
		this.next = next;
	}

	public int getVal() { return val; }
	public LNode getNext() { return next; }
}