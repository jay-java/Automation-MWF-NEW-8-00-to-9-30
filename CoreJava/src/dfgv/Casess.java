package dfgv;

public class Casess {
	public static void main(String[] args) {
		int a = 142;
//		if(a>40) {
//			a = a*2;
//			System.out.println(a);//true
//		}
//		else {
//			System.out.println("a is less than 40");//false
//		}
		
		if(a>100) {
			a = a-10;
			System.out.println(a);
		}
		else {
			System.out.println("a is less than 100");
		}
		
		
		
		
		
		
		
		//1.vehicle
		//2.colour
		String vehicle="car";
		String color = "red";
		if(vehicle.equals("car")) {
			if(color.equals("red")) {
				System.out.println("fast");//1.
			}
			else {
				System.out.println("not fast");//2.
			}
		}
		else {
			System.out.println("vehicle is not car");//3.
		}
	}
}
