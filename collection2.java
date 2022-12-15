package collection;
import java.util.ArrayList;
import java.util.Collections;
//import java.util.collections;

public class collection2 {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<>();
		a.add(5);
		a.add(8);
		a.add(7);
		a.add(3);
		System.out.println("Before sorting:"+a);
		Collections.sort(a);
		System.out.println("After sorting:"+a);
	}

}
