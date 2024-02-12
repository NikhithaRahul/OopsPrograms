package Myprogram;

public class HeirarC  extends HeirarA{
	public void sum(int a, int b, int c)
	{
		int d=a+b+c;
		System.out.println(" Sum : "+d);
	}

	public static void main(String[] args) {
		HeirarC obj = new HeirarC();
		obj.sum(10,20,30);
		obj.sub(50,10);
		HeirarB obj1=new HeirarB();
		obj1.mul();
		
		

	}

}
