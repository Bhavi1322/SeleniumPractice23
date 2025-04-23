package day21collectionexamples;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListExample1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		//ArrayList ref=new ArrayList();
			//or
		List ref=new ArrayList();
		ref.add("Pune");//String object will be upcasted to Object class object(Auto up casting)
		ref.add(120);//int will be converted in Integer class object(boxing), dn Integer class object will be updated to Object class object(auto upcasting)
		ref.add("Pune");
		ref.add(null);
		System.out.println("Total element in ArrayList: "+ref.size());
		System.out.println("Element inside ArrayList: "+ref);
		System.out.println("Element at index 1 in ArrayList: "+ref.get(1));
		for(int i=0;i<ref.size();i++) {
			System.out.println("Element at index "+i+" in ArrayList: "+ref.get(i));
		}
		//add element based on index
		ref.add(2, "Bangalore");
		System.out.println("Total element in ArrayList: "+ref.size());
		System.out.println("Element inside ArrayList: "+ref);
		//update value
		ref.set(3, "Apple");
		System.out.println("Total element in ArrayList: "+ref.size());
		System.out.println("Element inside ArrayList: "+ref);
		System.out.println("*************ArrayList elements using for-each*****************");
		for(Object obj:ref) {
			System.out.println(obj);
		}
		System.out.println("**************ArrayList elements using Iterator**********************");
		Iterator itr=ref.iterator();
		/*
		 * Iterator interface has 3 important methods
		 * 	hasNext()->boolean--> true indicate it has next element where false indicates no next element
		 * 	next() -> Object -> it will get the next element from the collection and print it, if no next element present dn it will throw an exception by name nosuchelementexception
		 * 	remove() -> this will help you to remove element from collection
		 * 
		 * NOTE: one Iterator object can be used only once, for 2nd Iteratoration you have to create new Iterator object
		 */
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());//NoSuchElementException
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("****************2nd time using iterator instance*****************************");
		System.out.println(itr.hasNext());
		
		Iterator itr2=ref.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("Program Ends");
	}


	}


