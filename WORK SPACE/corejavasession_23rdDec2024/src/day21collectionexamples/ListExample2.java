package day21collectionexamples;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListExample2 {

	public static void main(String[] args) { 
		System.out.println("Program Starts");
		//ArrayList ref=new ArrayList();
		        //or
		List ref=new ArrayList();
		ref.add("pune");//String object will be up casted to object class object(Auto up casting)
		ref.add(300);//int will be converted in Integer class object(boxing),dn Integer class object will be updated to object class object(auto upcasting)
		ref.add("pune");
		ref.add(null);
		System.out.println("Total element in ArrayList:"+ref.size());
		System.out.println("element inside ArrayList:"+ref);
		//System.out.println("element at index 1 in ArrayList:"+ref.get(1));
		
		List ref2=new ArrayList();
		ref2.add("Miransh");//String object will be up casted to object class object(Auto up casting)
		ref.add("samadhan");//int will be converted in Integer class object(boxing), dn Integer class object will be updated to object class object(auto up casting)
		System.out.println("Total element in ArrayList:"+ref.size());
		System.out.println("element inside ArrayList:"+ref);
		//add ref2 elements into ref arraylist at the end
		ref.addAll(ref2);
		System.out.println("Total element in ArrayList:"+ref.size());
		System.out.println("element inside ArrayList:"+ref);
		
		ref.removeAll(ref2);
		System.out.println("Total element in ArrayList:"+ref.size());
		System.out.println("element inside ArrayList:"+ref);
		
		//add ref2 elements into ref arraylist based on inndex
		ref2.addAll(1,ref);
		System.out.println("Total element in ArrayList:"+ref.size());
		System.out.println("element inside ArrayList:"+ref);
		System.out.println("Program ends");
		
		//ref.addAll(1,ref2);
		//System.out.println("Total element in ArrayList:"+ref.size());
		//System.out.println("element inside ArrayList:"+ref);
		
	}	
		
	}