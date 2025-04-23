package day21collectionexamples;
import java.util.ArrayList;
public class ArrayListExample2 {
      public static void main(String[] args) {
    	  ArrayList a1 = new ArrayList();
    	  System.out.println("Initial list od elements:"+ a1);
    	  System.out.println("list of elements status:"+a1.isEmpty());
    	  //Adding elements to the end of the list
    	  a1.add("ravi");
    	  a1.add("vijay");
    	  a1.add("Ajay");
    	  System.out.println("After invoking add(E e)method:"+ a1);
    	  //to get specific class behavior dn we need downcast the object
    	  String s1=(String)a1.get(0);//downcasting to get String class behavior
    	  System.out.println(s1.length());
    	  //Adding an element at the specific position
    	  a1.add(1, "Gaurav");
    	  System.out.println("After invoking add(int index,E element) method:"+a1);
    	  ArrayList al2 = new ArrayList();
    	  al2.add("sona");
    	  al2.add("Hanumat");
    	  //Adding second list elements to the  first list
    	  System.out.println("list al2 elements :"+al2);
    	  System.out.println("al element before adding al2:"+a1);
    	  a1.addAll(al2);
    	  System.out.println("list a1 element after adding list al2:"+a1);
    	  ArrayList al3 = new ArrayList();
    	  al3.add("john");
    	  al3.add("Rahul");
    	  System.out.println("Element of al2:"+al2);
    	  System.out.println("Element of al3:"+al3);
    	  //Adding second list elements to the first list at specific position al2.addAll(1, al3);
    	  al2.addAll(1, al3);
    	  System.out.println("After adding al3 into al2:"+al2);
      }


      }

