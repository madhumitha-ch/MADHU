package week3.day1;

public class Samsung extends AndroidTv implements Android{
	
	   public static void main(String[] args) {
	   //samsung-to implement missing method   
	   Samsung s=new Samsung();
	   System.out.println("*******Abstraction*******");
	   s.OpenApp();
	   s.PlayMusic();
	   s.playVideo();	   
	   }

	public void playVideo()
    {
    	System.out.println("Play the video");
    }
    public void PlayMusic()
    {
    	System.out.println("Abstract class to play music");
    }
    public void OpenApp() {
		// TODO Auto-generated method stub
    	System.out.println("open the app");
	}
	   
}
