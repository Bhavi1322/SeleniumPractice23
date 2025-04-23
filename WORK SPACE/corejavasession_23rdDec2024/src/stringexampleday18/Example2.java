package stringexampleday18;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		//creating String object using literals
		String s1="pune";//new object will be created and stored in String constant pool
		System.out.println("s1:"+s1);//String object creation using new keyword
		String s4=new String("pune");//
		System.out.println("s4:"+s4);
		System.out.println("comparing s4 and s1 with'equals()':"+s4.equals(s1));
        System.out.println("comparing s4 and s1 with'==':"+(s4==s1));
        System.out.println("Program ends");

	}

}
