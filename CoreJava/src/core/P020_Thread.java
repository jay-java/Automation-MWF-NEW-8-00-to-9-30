package core;
class AnotherThread implements Runnable{

	@Override
	public void run() {
		Thread t = new Thread();
		System.out.println(t.currentThread());
		t.setName("MyThread");
		System.out.println(t);
		System.out.println("thread in loop");
		for (int i = 1; i <= 5; i++) {
			System.out.println(t);
			try {
				t.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("thread terminate");
	}
	
}
class NewThread extends Thread{
	public void run() {
		Thread t = new Thread();
		System.out.println(t.currentThread());
		t.setName("MyThread");
		System.out.println(t);
		System.out.println("thread in loop");
		for (int i = 1; i <= 5; i++) {
			System.out.println(t);
			try {
				t.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("thread terminate");
	}
}
public class P020_Thread {
	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t.currentThread());
		t.setName("MyThread");
		System.out.println(t);
		System.out.println("thread in loop");
		for (int i = 1; i <= 5; i++) {
			System.out.println(t);
			try {
				t.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("thread terminate");
		System.out.println("By using thread class");
		NewThread n = new NewThread();
		n.run();
		System.out.println("By using runnable interface");
		AnotherThread a = new AnotherThread();
		a.run();
	}
}
