package day21collectionexamples;
import java.util.ArrayList;
import java.util.Iterator;
import  java.util.List;
public class ListExample {

	public static void main(String[] args) {
		System.out.println("Program Starts");
	//	ArrayList ref=new ArrayList();
              //or
	List ref=new ArrayList();
	ref.add("pune");//String object will be up casted to object class object(Auto up casting)
	ref.add(120);//int will be converted in Integer class object(boxing),dn Integer class object will be updated to object class object(auto upcasting)
	ref.add("pune");
	ref.add(null);
	System.out.println("Total element in ArrayList:"+ref.size());
	System.out.println("element inside ArrayList:"+ref);
	System.out.println("element at index 1 in ArrayList:"+ref.get(1));
	for(int i=0;i<ref.size();i++) {
		System.out.println("element at index "+ i +" in ArrayList:"+ref.get(i));
	}
	//add element based on index
	ref.add(2, "Bangalore");
	System.out.println("Total element in ArrayList:"+ref.size());
	System.out.println("element inside ArrayList:"+ref);
	//update value
	ref.set(3,  "Mango");
	System.out.println("Total element in ArrayList:"+ref.size());
	System.out.println("element inside ArrayList:"+ref);
	System.out.println("************************************ArrayList elements using for each***************");
	for(Object obj:ref) {
		System.out.println(obj);
	}
	System.out.println("**********************************************Arraylist elements using Iterator*******************");
	Iterator itr=ref.iterator();
	System.out.println(itr.next());
	System.out.println(itr.next());
	System.out.println(itr.next());
	System.out.println(itr.next());
	System.out.println(itr.next());
	System.out.println(itr.next());//NoSuchElementException
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	System.out.println("*****************************************2nd time using iterator instance************");
	System.out.println(itr.hasNext());
	Iterator itr2=ref.iterator();
	while(itr2.hasNext()) {
	System.out.println(itr2.next());
	}
	System.out.println("Program ends");
	}
}
