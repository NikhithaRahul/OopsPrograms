package AbstractPackage;

public class AbstractB extends AbstractA{
	public void run()
	{
		System.out.println("Run");
	}

	public static void main(String[] args) {
		AbstractB obj = new AbstractB();
		obj.run();
		obj.show();
		

	}

}
