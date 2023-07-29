package week3.day1;

public class iphone1 extends ios{

	 public void makeCall() {
		System.out.println("child class -make a Call");
	 }
	 public void sendSMS() {
		System.out.println("child class-send SMS");
	 }
	
	//Overriding method of parent class
	@Override
	public void startApp() {
		System.out.println("Start app method is in childclass");
	}
	public static void main(String[] args) {
		iphone1 ph = new iphone1();
		ph.startApp();
	}
}

