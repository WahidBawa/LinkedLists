/*
	Question 1
	Creator: Wahid Bawa
	Purpose: To test the new methods that are added in
*/
public class Main {
	public static void main(String[] args) {
		LList list = new LList();
		list.add(88);
		list.add(99);
		list.add(12);
		list.add(111111);
		System.out.println(list);
		System.out.println(list.pop() + " is popped!!");
		System.out.println(list);

	}
}
