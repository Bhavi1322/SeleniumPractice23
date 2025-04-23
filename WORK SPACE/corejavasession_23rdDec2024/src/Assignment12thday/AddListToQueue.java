package Assignment12thday;
 import java.util.ArrayList;
 import java.util.LinkedList;
 import java.util.List;
 import java.util.Queue;
 
public class AddListToQueue {

	public static void main(String[] args) {
	  List<Integer> list = new ArrayList<>();
	  list.add(5);
	  list.add(4);
	  list.add(3);
	  list.add(1);

	
     Queue<Integer> queue = new LinkedList<>();
     queue.addAll(list);
     
     System.out.println("Queue:"+queue);
     
	}
}

