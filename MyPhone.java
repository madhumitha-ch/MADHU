package week3.day1;

public class MyPhone {
       public static void main (String args []) {
	   iphone oc =new iphone();
	   oc.startApp();
	   oc.increaseVolume();
	   oc.shutdown();
	   oc.makeCall();
	   oc.sendSMS();
	   //oc.watchmovie();
       }
}
class ios{
	public void startApp(){
		System.out.println("Start the App");
	}
	public void increaseVolume(){
		System.out.println("Increase Volume");
	}
	public void shutdown(){
		System.out.println("Shut down the mobile");
	}
}
class iphone extends ios{
      public void watchMovie(){
    	  System.out.println("Watch the movie");
      }

	public void makeCall() {
		// TODO Auto-generated method stub
		
	}

	public void sendSMS() {
		// TODO Auto-generated method stub
		
	}
}
