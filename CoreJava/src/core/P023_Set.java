package core;

import java.util.HashSet;
import java.util.Set;

public class P023_Set {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(1);
		set.add("java");
		set.add(345.34);
		set.add(false);
		set.add('r');
		set.add(1);
		set.add('f');
		System.out.println(set);
	}
}