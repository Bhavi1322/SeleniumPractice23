package Assignment12thday;
import java.util.*;
public class ListToQueue {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(1,2,3,4,5,6,7,8);
		
		
		Queue<Integer>queue=new LinkedList<>(list);
		
		System.out.println("Queue:" +queue);
	}

}
