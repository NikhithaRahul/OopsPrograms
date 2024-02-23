package ExceptionHandling;

public class ArrayIndexException {
	public void display()
	{
		try
		{
			int a[]=new int[5];
			a[9]=10;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println(" Exception Handled");
		}
	}
	

	public static void main(String[] args) {
		ArrayIndexException obj = new ArrayIndexException();
		obj.display();
		
		
	}

}
