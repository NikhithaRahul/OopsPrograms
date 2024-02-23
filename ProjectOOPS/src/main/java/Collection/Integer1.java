package Collection;
import java.util.ArrayList;
import java.util.List;

public class Integer1 {

	public static void main(String[] args) {
	ArrayList<Integer> obj = new ArrayList<Integer>();
	obj.add(8);
	obj.add(7);
	obj.add(56);
	int size = obj.size();
	System.out.println(size);
	obj.remove(1);
	obj.add(2,8);
	System.out.println(obj.contains(3));
	System.out.println(obj);

	}

}
