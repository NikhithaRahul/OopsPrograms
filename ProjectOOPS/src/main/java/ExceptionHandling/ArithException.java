package ExceptionHandling;

public class ArithException {
	public void display()
	{
		try
		{
		int a=5/0;
		}
		
	
	catch (ArithmeticException e)
	{
		System.out.println(e);
		System.out.println("Exception Handled");
	}
	}

	public static void main(String[] args) {
		ArithException obj =new ArithException();
		obj.display();
		
	}

}
