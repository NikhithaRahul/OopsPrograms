package InterfacePackage;

public class InterC implements InterA,InterB{
	
	public void display() {
		System.out.println("Hello");
		
	}

	public void show() {
		System.out.println("Good");
		
	}
	public static void main( String args[])
	{
		InterC obj = new InterC();
		obj.display();
		obj.show();
		
	}
}
