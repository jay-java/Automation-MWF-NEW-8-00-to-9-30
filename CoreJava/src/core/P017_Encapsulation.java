package core;

class Laptop {
	private int ram;
	private int storage;
	private double display;
	private String model;
	Laptop(){
		
	}
	Laptop(int ram, int storage, double display, String model) {
		this.ram = ram;
		this.storage = storage;
		this.display = display;
		this.model = model;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getRam() {
		return ram;
	}

	public void setStorage(int storage) {
		this.storage = storage;
	}

	public int getStorage() {
		return storage;
	}

	public void setDisplay(double display) {
		this.display = display;
	}

	public double getDisplay() {
		return display;
	}

	public void setModel(String model) {
		this.model = model;
	}
	public String getModel() {
		return model;
	}
	@Override
	public String toString() {
		return "ram : "+ram+" storage : "+storage+" display : "+display+" model : "+model;
	}
}

public class P017_Encapsulation {
	public static void main(String[] args) {
		Laptop l1 = new Laptop(10, 250, 15.6, "Dell");
		System.out.println(l1);
		Laptop l2 = new Laptop();
		l2.setRam(12);
		l2.setStorage(560);
		l2.setDisplay(15.6);
		l2.setModel("Lenovo");
		System.out.println(l2.getRam());
		System.out.println(l2.getStorage());
		System.out.println(l2);
	}
}
