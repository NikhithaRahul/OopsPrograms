package ExceptionHandling;

public class Nullprgm {
	public void display()
	{
		try
		{
			String str=null;
			System.out.println(str.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
			System.out.println("Exception Handled");
		}
	}

	public static void main(String[] args) {
		Nullprgm obj = new Nullprgm();
		obj.display();
		
		
	}

}
