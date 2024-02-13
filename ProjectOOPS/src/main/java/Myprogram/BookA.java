package Myprogram;

public class BookA {
	int no;
	float price;
	Book p;
	BookA(int no,float price,Book p)
	{
	this.no=no;
	this.price=price;
	this.p=p;
	}
	public void display()
	{
		System.out.println(p.a+"  "+p.b);
		System.out.println(no+"  "+price);
	}

	public static void main(String[] args) {
		Book obj = new Book("Diary",100);
		BookA obj1= new BookA(50,20.0f,obj);
		obj1.display();
		
	}

}
