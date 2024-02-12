package core;
interface inter1{
	public void call();
	public static void calling() {
		System.out.println("static in interface");
	}
	
}
interface inter2 extends inter1{
	public void call1();
	public static void calling1() {
		System.out.println("static in interface");
	}
}interface inter3{
	
}
class CallInterface implements inter2,inter3{
	public void run() {
		System.out.println("run funciton in call class");
	}

	@Override
	public void call() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void call1() {
		// TODO Auto-generated method stub
		
	}
}
public class P019_interface {
	public static void main(String[] args) {
		CallInterface c = new CallInterface();
		c.call();
		c.call1();
		c.run();
		inter1.calling();
	}
}
