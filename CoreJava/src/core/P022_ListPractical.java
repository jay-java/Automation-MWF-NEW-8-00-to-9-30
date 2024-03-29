package core;

import java.util.ArrayList;
import java.util.List;

class Mobile{
	int ram;
	int storage;
	String model;
	String processor;
	
	public Mobile(int ram, int storage, String model, String processor) {
		super();
		this.ram = ram;
		this.storage = storage;
		this.model = model;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Mobile [ram=" + ram + ", storage=" + storage + ", model=" + model + ", processor=" + processor + "]";
	}
	
}
public class P022_ListPractical {
	public static void main(String[] args) {
		Mobile m1 = new Mobile(8, 128, "Lenovo", "mediatek");
		Mobile m2 = new Mobile(10, 256, "samsung", "Snapdragon");
		Mobile m3 = new Mobile(12, 64, "OPPO", "mediatek");
		Mobile m4 = new Mobile(16, 128, "APPLE", "M2");
		List<Mobile> list= new ArrayList<Mobile>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		System.out.println(list);
		for(Mobile m:list) {
			System.out.println(m);
		}
		
	}
}
