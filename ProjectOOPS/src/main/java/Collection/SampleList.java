package Collection;
import java.util.*;

public class SampleList {

	public static void main(String[] args) {
	LinkedList<String> obj = new LinkedList<String>();
	obj.add("Henna");
	obj.add("Nikhitha");
	obj.add("Anvi");
	obj.remove(2);
	for(String a:obj)
	{
		System.out.println(a);
	}
	}

}
