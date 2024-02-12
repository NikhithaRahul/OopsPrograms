package Myprogram;

public class MultilevelC extends MultilevelB {
	public void div()
	{
		int a=50,b=10;
		int c= a/b;
		System.out.println("Division of two number :"+c);
		
	}

	public static void main(String[] args) {
		MultilevelC obj= new MultilevelC();
		obj.sum();
		obj.sub();
		obj.div();
		

	}

}
