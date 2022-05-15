package week1.day1;

public class Car {

	public void applyBreak() {
		System.out.println("Apply Break");
	}
	public void applyGear() {
		System.out.println("Apply Gear");
	}
	public void switchOnAc() {
		System.out.println("Switch on the AC");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Car myData = new Car();
        myData.applyBreak();
        myData.applyGear();
        myData.switchOnAc();
	}

}
