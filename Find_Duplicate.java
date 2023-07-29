package week1.day2;

public class Find_Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //Entering  values
		int[] values= {2,5,7,7,5,9,2,3};
		
		//checking values
		for (int x=0;x<values.length;x++)
		{
			for (int y=x+1;y<values.length;y++)
			{
		     	if(values[x]==values[y])
		     	{
		     		System.out.println("Duplicate Value is:"+values[x]);;
		     	}
		    }
		}
	}
	}

