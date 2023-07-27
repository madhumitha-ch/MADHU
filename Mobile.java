package week1.day1;

public class Mobile {
	
	public void makeCall() {
				       System.out.println("Calling the user");
				       
	}

	public void getMsg() {
	       System.out.println("Messaging the user");
	       
    }

//mobileMode1 (String).mobileWeight (float)
//In second method create variable isFullCharged (boolean).mobileCost (int)

String mobileMode1="Samsung s20";
float mobileWeight = 162.5f;
boolean isFullyCharged=true;
int mobileCost=50000;

public static void main(String[] args) {
	
	Mobile obj=new Mobile();
	obj.makeCall();
	obj.getMsg();
	System.out.println("This is my Mobile");
	
	System.out.println("mobileMode1" +obj.mobileMode1);
	System.out.println("mobileWeight" +obj.mobileWeight);
	System.out.println("isFullyCharged" +obj.isFullyCharged);
	System.out.println("mobileCoat" +obj.mobileCost);

    }
}

