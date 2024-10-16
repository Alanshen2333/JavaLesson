import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		String key, value;
		String[] engilsh = { "Sun", "Mon", "Tues", "Wed", "Thur", "Fri", "Sat" };
		String[] chinese = { "星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六" };
		HashMap<String, String> hashMap = new HashMap<String, String>();
		for (int i = 0; i < chinese.length; i++) {
			hashMap.put(engilsh[i], chinese[i]);
		}
		Set<String> keys = hashMap.keySet();
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			key = it.next();
			value = hashMap.get(key);
			System.out.print(key + " " + value + "\t");
		}
		System.out.println();

		TreeMap<String, String> treeMap = new TreeMap<String, String>(hashMap);
		keys = treeMap.keySet();
		it = keys.iterator();
		while (it.hasNext()) {
			key = it.next();
			value = treeMap.get(key);
			System.out.print(key + " " + value + "\t");
		}
	}
}
