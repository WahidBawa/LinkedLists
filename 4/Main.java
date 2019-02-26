/*
	Question 4
	Creator: Wahid Bawa
	Purpose: To test the new methods that are added in
*/
public class Main {
	public static void main(String[] args) {
		LList list = new LList();
		list.sortedInsert(11);
		list.sortedInsert(10);
		list.sortedInsert(15);
		list.sortedInsert(12);
		System.out.println(list);
	}
}
