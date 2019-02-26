/*
	Question 6
	Creator: Wahid Bawa
	Purpose: To create a node which will be implemented within a linked list class
*/
public class LNode {
	private int val;
	private LNode next, prev;

	public LNode(int val, LNode prev, LNode next) {
		this.val = val;
		this.next = next;
		this.prev = prev;
	}

	public int getVal() { return val; }
	public LNode getPrev() { return prev; }
	public LNode getNext() { return next; }
	public void setPrev(LNode prev) { this.prev = prev; }
	public void setNext(LNode next) { this.next = next; }
}
