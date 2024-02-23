package ExceptionHandling;

public class FinallyProgram {
	public void display()
	{
		try
		{
			int a=10/0;
		}
		finally
		{
			int a=3,b=10;
			int c=a+b;
			System.out.println(c);
			
		}
	}

	public static void main(String[] args) {
		FinallyProgram obj = new FinallyProgram();
		obj.display();
		

	}

}
