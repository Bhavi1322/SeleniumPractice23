package day21collectionexamples;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListExample3 {

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
		
		List ref2=new ArrayList();
		ref2.add("Aman");//String object will be upcasted to Object class object(Auto up casting)
		ref2.add("Shyam");//int will be converted in Integer class object(boxing), dn Integer class object will be updated to Object class object(auto upcasting)
		System.out.println("Total element in ArrayList2: "+ref2.size());
		System.out.println("Element inside ArrayList2: "+ref2);
		//add ref2 elements into ref arraylist at the end
		ref.addAll(ref2);
		System.out.println("Total element in ArrayList: "+ref.size());
		System.out.println("Element inside ArrayList: "+ref);
		
		ref.removeAll(ref2);
		System.out.println("Total element in ArrayList: "+ref.size());
		System.out.println("Element inside ArrayList: "+ref);
		
		//add ref2 elements into ref arraylist based on index
		ref2.addAll(1,ref);
		System.out.println("Total element in ArrayList: "+ref2.size());
		System.out.println("Element inside ArrayList: "+ref2);
		System.out.println("Program Ends");
	}

}

}
