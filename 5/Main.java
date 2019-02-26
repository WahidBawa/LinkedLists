/*
	Creator: Wahid Bawa
	Purpose: To test the new methods that are added in
*/
public class LTest {
	public static void main(String[] args) {
		LList list = new LList();
		list.add(10);
		list.add(10);
		list.add(11);
		list.add(11);
		list.add(11);
		list.add(11);
		list.add(12);
		list.add(12);
		list.add(13);
		list.add(1212);
		list.add(1212);
		list.add(1212);

		System.out.println(list);
		list.removeDuplicates();
		System.out.println(list);
	}
}
