package week1.day2;

public class Data {

	public float add(int a,float b) {
		return a+b;
		
	}
	//5+6.6=11.6 
	
	public static void main(String[] args) {
				//datatype variable = value
		int age=34;
		System.out.println(age);
		
		Data d=new Data();
		
		System.out.println(d.add(6, 5.5f));

	}

}