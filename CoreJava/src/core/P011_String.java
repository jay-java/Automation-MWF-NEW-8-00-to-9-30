package core;

public class P011_String {
	public static void main(String[] args) {
		char c[] = {'j','a','v','a'};
		System.out.println(c);
		int a = 12;
		int b = 12;
		System.out.println(a+b);
		String name = "124@#$%hello user you are learning java";
		System.out.println(name);
		String a1 = "12";
		String a2 = "@#$";
		System.out.println(a1+a2);
		System.out.println(name.length());
		String s1 = "java";
		System.out.println(s1.toUpperCase());
		String s2 = "javA";
		System.out.println(s1.concat(s2));
		System.out.println(name.contains("usery"));
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareToIgnoreCase(s2));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		String s3 = "    ";
		System.out.println(s3.isBlank());
		System.out.println(s3.isEmpty());
		String s4 ="			 ja    va			";
		System.out.println(s4.trim());
	}
}
