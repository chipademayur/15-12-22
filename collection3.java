package collection;
import java.util.LinkedList;

public class collection3 {

	public static void main(String[] args) {
		LinkedList<Integer>queue=new LinkedList<Integer>();
		for(int i=1;i<=5;i++) 
			queue.add(i);
			System.out.println("Queue:"+queue);
			System.out.println("Front Removed:"+queue.remove());
			System.out.println("Queue:"+queue);
			System.out.println("Head of Queue:"+queue.peek());
			queue.addLast(6);
			System.out.println("Size of Queue:"+queue.size());
			System.out.println("Queue:"+queue);
		

	}

}
