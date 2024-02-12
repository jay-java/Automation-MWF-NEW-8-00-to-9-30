package core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//<generics>
public class P021_List {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(1);
		list.add("name");
		list.add(45.4);
		list.add(false);
		list.add('f');
		list.add(25454654);
		list.add(1);
		list.add(1);
		list.add(2343);
		System.out.println(list);
		list.add(32534.3);
		System.out.println(list);
		list.remove(6);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
