package AbstractPackage;

public class AbstractEg3 extends AbstractEg2
{   int a=60,b=50;
     int c;
	public void add()
	{
		
		c=a+b;
		System.out.println(" Result: "+c);
	}
	public void sub()
	{
		c=a-b;
		System.out.println("Result :"+c);
	}
	

	public static void main(String[] args)
	{
		AbstractEg3 obj = new AbstractEg3();
		obj.show();
		obj.display();
		obj.add();
		obj.sub();
		

	}

}
