package core;

class Parent{
	public void parentFunction() {
		System.out.println("parent");
	}
}
class Child extends Parent{
	public void childFunction() {
		System.out.println("Child");
	}
}
class GrandChild extends Child{
	public void grandChildFunction() {
		System.out.println("parent");
	}
}
class Person1{
	public void call() {
		
	}
	
}
class Person2 extends Person1{
public void call() {
		
	}
}
class Person3 extends Person1{
	
}
public class P014_Inheritance {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.parentFunction();
		Child c = new Child();
		c.childFunction();
		c.parentFunction();
		
	}
}
