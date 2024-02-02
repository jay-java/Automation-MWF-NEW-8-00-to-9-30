package core;
class Poly{
	public void call(int i) {
		System.out.println("call 1 function");
	}
	public void call(int i,int j) {
		System.out.println("call 2 function");
	}
}
class Child1 extends Poly{
	public void call(int i) {
		super.call(10);
		System.out.println("call in child class");
	}
}
public class P015_Polymorphism {
	public static void main(String[] args) {
		Poly p = new Poly();
		p.call(10);
		Child1 c = new Child1();
		c.call(10);
	}
}
