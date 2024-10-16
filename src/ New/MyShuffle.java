import java.util.*;

public class MyShuffle {
	public static void main(String[] args) {
		List<Integer> LinkedList = new LinkedList<Integer>();
		for (int i = 0; i < 10; i++) {
			int n = (int) (Math.random() * 100) + 1;
			LinkedList.add(n);
		}
		System.out.println("洗牌前链表中数据的顺序为：");
		Iterator<Integer> iter = LinkedList.iterator();
		while (iter.hasNext()) {
			Integer num = iter.next();
			System.out.print(num.intValue() + " ");
		}
		System.out.println();
		Collections.shuffle(LinkedList);
		System.out.println("洗牌后链表中数据的顺序为:" + " ");
		iter = LinkedList.iterator();
		while (iter.hasNext()) {
			Integer num = iter.next();
			System.out.print(num.intValue() + " ");
		}
		System.out.println();
		System.out.println("向左旋转两次之后链表中的数据顺序为:");
		Collections.rotate(LinkedList, -2);
		iter = LinkedList.iterator();
		while (iter.hasNext()) {
			Integer num = iter.next();
			System.out.print(num.intValue() + " ");
		}
		System.out.println("\r");
	}
}
