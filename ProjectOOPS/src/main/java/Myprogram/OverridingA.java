package Myprogram;

public class OverridingA {
	int a, b,c,d;
	public void sum(int a,int b,int c)
	{
		this.a=a;
		this.b=b;
		this.c=c;
		 d=a+b+c;
		 this.show();
	}
	public void show()
	{
		System.out.println(" Addition : "+d);
	}

}
