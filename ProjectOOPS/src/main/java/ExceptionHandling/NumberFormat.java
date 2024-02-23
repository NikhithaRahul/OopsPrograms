package ExceptionHandling;

public class NumberFormat {
	public void display()
	{
		try
		{
			String str= " hello";
			int num= Integer.parseInt(str);
			
		}
		catch(NumberFormatException e)
		{
			System.out.println(e);
			System.out.println(" Exception Handled");
		}
	}

	public static void main(String[] args) {
		 NumberFormat obj = new  NumberFormat();
		 obj.display();
		
		

	}

}
