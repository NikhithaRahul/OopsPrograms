package InterfacePackage;

public class MultipleC implements MultipleA,MultipleB {
	public void add()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println(" Result :"+c);
	}
	
	public static void main(String[] args) {
		MultipleC obj =  new MultipleC();
		obj.add();
		
	}

}
