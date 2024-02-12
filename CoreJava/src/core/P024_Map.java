package core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class P024_Map {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "c");//entry
		map.put("java", 2);
		map.put('s', 2343.45);
		map.put(4, "python");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
