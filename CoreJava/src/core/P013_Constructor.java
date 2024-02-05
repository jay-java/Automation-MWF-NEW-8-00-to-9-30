package core;
class User{
	int i;
	String name;
	User(){
		System.out.println("default cons");
	}
	User(int i){
		System.out.println("para : "+i);
	}
	User(String name){
		System.out.println("para : "+name);
	}
	User(int i,String name){
		this.i = i;
		this.name=name;
		System.out.println("i = "+i+" name = "+name);
		}
	public void call() {
		System.out.println("call function");
	}
	public void showData() {
		System.out.println("i = "+i+" name = "+name);
	}
}
public class P013_Constructor {
	public static void main(String[] args) {
		User u1 = new User(1,"abbas");
		u1.showData();
		User u2 = new User(2,"devarsh");
		u2.showData();
		User u3 = new User(3,"harsh");
		u3.showData();
		User u4 = new User(4,"zankhana");
		u4.showData();
	}
}