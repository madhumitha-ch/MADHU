package week3.day1;
//METHOD OVERLOADING

public class Calculator {
	public void add(int a,int b) {
		System.out.println(a+b);
	}
	public void add(int a,int b,int c) {
		int d=a+b+c;
		System.out.println(d);
	}
	public void multiple(double a,double b) {
		System.out.println(a*b);
	}
	public void multiple(float a,float b,float c) {
	    float d=a*b*c;
		System.out.println(d);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calculator oc = new Calculator ();
        oc.add(10,20);
        oc.add(10,20,30);
	    oc.multiple(2.0,3.0);
	    oc.multiple(4.0f,5.0f,6.0f);
	
	}

}
