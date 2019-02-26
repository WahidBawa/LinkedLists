
public class LTest {
	public static void main(String[] args) {
		LList list = new LList();
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);

		System.out.println(list);
		list.reverse();
		System.out.println(list);
	}
}
