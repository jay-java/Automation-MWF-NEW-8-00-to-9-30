package core;

abstract class RBI{
	abstract public void SA();
	abstract public void HL();
	public static void repoRate() {
		System.out.println("repoRate +-4%");
	}
}
class SBI extends RBI{
	public void SA() {
		System.out.println("SBI SA 3%");
	}
	public void HL() {
		System.out.println("SBI HL 7%");
	}
}
class PNB extends RBI{
	public void SA() {
		System.out.println("PNB SA 4%");
	}
	public void HL() {
		System.out.println("PNB HL 8%");
	}
}
class JAVA extends RBI{
	public void SA() {
		System.out.println("JAVA SA 5%");
	}
	public void HL() {
		System.out.println("JAVA HL 9%");
	}
}

public class P016_Abstraction {
	public static void main(String[] args) {
		SBI s = new SBI();
		s.SA();
		s.HL();
		PNB p = new PNB();
		p.SA();
		p.HL();
		JAVA j = new JAVA();
		j.SA();
		j.HL();
		SBI.repoRate();
		PNB.repoRate();
		JAVA.repoRate();
	}
}