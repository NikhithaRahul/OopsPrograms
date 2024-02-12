package Myprogram;

public class MethodOver {
	String name;
	int age;
	float salary;
	MethodOver(String name, int age)
	{
		this.name=name;
		this.age=age;
		this.show();
	}
	public void show()
	{
		System.out.println("Name :  "+name +"  "+ "Age :  "+age+"  "+ " Salary :  "+salary);
	}
	public void show(String name, int age, float salary)
	{
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.show();
		
	}
	
	public static void main(String[] args) {
		MethodOver obj= new MethodOver("Nikhitha",31);
		obj.show("Rahul",33,30000.0f);
	

	}

}
