package day21collectionexamples;
import java.util.LinkedList;
public class LinkedListExxample1 {

	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
		System.out.println("Initial list of elements:"+ll);
		ll.add("bhavi");
		ll.add("miru");
		ll.add("sam");
		System.out.println("After invoking add(E e)method:"+ll);
		//Adding an element at the specific position
		ll.add(1, "Gaurav");
		System.out.println("After invoking add(int index, E element)method:"+ll);
		LinkedList<String> ll2 = new LinkedList<String>();
		ll2.add("John");
		ll2.add("Hanumat");
		//Adding second list elements to the first list
		ll.addAll(ll2);
		System.out.println("After invoking addAll(collection<? extends E> c)method:"+ll);
		LinkedList<String>ll3=new  LinkedList<String>();
		ll3.add("sam");
		ll3.add("rahul");
		//Adding second list elements to the first list at specific position
		ll.addAll(1,ll3);
		System.out.println("After invoking addAll(int index,cllection<? extends E> c)method:"+ll);
		//Adding  an elements at the first position
		ll.addFirst("Lokesh");
		System.out.println("After invoking add(E e)method:"+ll);
		//Adding an element at the last position
		ll.addLast("Harsh");
		System.out.println("After invoking addLast(E e)method:"+ll);
	}

}
