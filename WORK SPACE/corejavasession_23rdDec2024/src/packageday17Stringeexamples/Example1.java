package packageday17Stringeexamples;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program starts ");
		//creating String object using literals
		String s1="pune";//new object will be created and stored in String constant pool
		String s2="Mumbai";//new object will be created and stored in String constant pool
        String s3="Pune";//as its a duplicate to s1,hence no object creation it will point to existing object s1
        System.out.println("s1:"+s1);
        System.out.println("s2:"+s2);
        System.out.println("s3:"+s3);
        System.out.println("comparing s1 and s2 with'==':"+(s1==s2));
        System.out.println("comparing s1 and s2 with'equals()':"+s1.equals(s2));
        System.out.println("comparing s1 and s3 with'==':"+(s1==s3));
        System.out.println("comparing s1 and s2 with'equals()':"+s1.equals(s3));
        //String object creation using new keyword
        String s4=new String("Delhi");//two object will be created.1.in SCP 2. in NCP
        String s5=new String("Delhi");//one object will be created.1.in NCP
        System.out.println("s4:"+s4);
        System.out.println("s5:"+s5);
        System.out.println("comparing s4 and s5 with'equals()':"+s4.equals(s5));
        System.out.println("comparing s4 and s5 with'==':"+(s4==s5));
        System.out.println("Program ends");
        
	}

}

/*
String:
	predefined class belongs to java.lang
	it represent group of characters or sequence of character, all character will be stored in index basis
	its immutable class which mean once object it created its value can;t be changed, if you change it will create new object
	Object can be created in 2 ways
		1. using literal "": it will create unique object inside String constant pool
		2. using new keyword: it won;t check uniqueness of object while creating object that mean here duplicate object are allowed
	in String class below mentioned Object class methods are overrided
		toString()---> it print value stored inside the object instead of fully Qualified class name
		equals(Object obj) -> it will compare two objects based on values instead of address
		== -> it will compare two object based on address instead of values
*/