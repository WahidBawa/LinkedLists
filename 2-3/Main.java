/*
	Creator: Wahid Bawa
	Purpose: To test the new methods that are added in
*/
public class LTest {
	public static void main(String[] args) {
		LList list = new LList();
		list.add(88);
		list.add(99);
		list.add(12);
		list.add(111111);
		System.out.println(list);
		System.out.println(list.dequeue());
		System.out.println(list);
		list.deleteAt(2);
		System.out.println(list);

	}
}
