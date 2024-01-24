package core;
//1.for(initialization; condition; increment/decrement)
//2.while(condition) {body}
//3.do{body} while(condition);
//4.for each(){}
public class P007_Loops {
	public static void main(String[] args) {
		for(int i=11;i<=10;i++) {
			System.out.println(i);
		}
		int j=11;
		while(j<=10) {
			System.out.println(j);
			j++;
		}
		int k=11;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=10);
	}
}
