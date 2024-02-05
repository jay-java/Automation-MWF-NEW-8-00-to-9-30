package core;

class Student {
	int id;
	String name;
	double per;
	static String cname = "TOPS";
	static {
		System.out.println("hello static block->Student class method");
	}

	Student(int id, String name, double per) {
		this.id = id;
		this.name = name;
		this.per = per;
	}

	public void showData() {
		System.out.println("id : " + id + " name : " + name + " per : " + per + " cname : " + cname);
	}
	public static void call() {
		System.out.println("call function");
	}

}

public class P012_Static {
	static {
		System.out.println("hello static block->Main method");
	}

	public static void main(String[] args) {
		System.out.println("hello main method");
		Student s1 = new Student(1, "abc", 56.23);
		s1.showData();
		Student.call();
	}
}