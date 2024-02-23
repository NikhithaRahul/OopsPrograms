package InterfacePackage;

public class Even4 extends Even3 {
	public void add()
	{
		int a=10,b=30;
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		Even4 obj = new Even4();
		obj.add();
		obj.display();
		obj.show();
		
		
	}

}
