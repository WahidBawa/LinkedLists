/*
	Creator: Wahid Bawa
	Purpose: To test the new methods that are added in
*/
public class Main {
	public static void main(String[] args) {
		LList list = new LList();
		list.add(10);
		list.add(11);
		list.add(12);

		LList newList = list.clone();
		newList.add(13);
		System.out.println(list);
		System.out.println(newList);
	}
}
