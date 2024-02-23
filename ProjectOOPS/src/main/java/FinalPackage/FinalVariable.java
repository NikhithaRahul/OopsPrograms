package FinalPackage;

public class FinalVariable {
 final String name="Tata Tiago";
	public void show()
	{
		name="Tata Harrier";
		System.out.println(name);
	}

	public static void main(String[] args) {
		FinalVariable obj = new FinalVariable();
		obj.show();
		
		
	}

}
