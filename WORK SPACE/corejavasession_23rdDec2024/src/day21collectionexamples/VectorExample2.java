package day21collectionexamples;
import java.util.Vector;
public class VectorExample2 {

	public static void main(String[] args) {
		//create a vector
		Vector<String>vec=new Vector<String>();
		System.out.println("Elements are:"+vec.capacity());
		//Adding elements using add()method of List
		vec.add("Tiger");
		vec.add("Cat");
		vec.add("Dog");
		vec.add("Dear");
		vec.add("Elephant");
		vec.add("Lion");
		vec.add("Cat");
		vec.add("Elephant");
		vec.add("Tiger");
		System.out.println("Elements are:"+vec);
		System.out.println("After adding 10 Elements capacity is:"+vec.capacity());
		vec.addElement("mat");
		System.out.println("After adding 11th Elements capacity is:"+vec.capacity());
		System.out.println("Elements are:"+vec);
		for(String str:vec) {
			System.out.println(str);
		}
		//Additional method of vector
		System.out.println("Returns 1st Element of Vector:"+vec.firstElement());
		System.out.println("Returns last Element of Vector:"+vec.lastElement());
		System.out.println("Last index of tiger object:"+vec.lastIndexOf("Tiger"));
	}

}
