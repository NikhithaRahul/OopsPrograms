package Myprogram;

public class OverridingB extends OverridingA {
	public void sum(int a, int b, int c)
	{
		super.sum(20,20,20);
		super.a=a;
		super.b=b;
		super.c=c;
		super.d=a+b+c;
		super.show();
		
	}
	
	
	public static void main(String[] args) {
		OverridingB obj = new OverridingB();
		obj.sum(30,30,30);
		
	}

}
