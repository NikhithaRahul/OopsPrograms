package CustomException;

public class Sample {
	public void display(int age) throws LiscenceException
	{
		if ( age<18)
		{
			throw new LiscenceException("NotEligile");
			
		}
		else
		{
			System.out.println(" Eligible");
		}
	}
	public static void main (String args[]) 
	{
		Sample obj=new Sample();
		try {
			obj.display(20);
		} catch (LiscenceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();// it is an alternate for printing
		}
	}

}
