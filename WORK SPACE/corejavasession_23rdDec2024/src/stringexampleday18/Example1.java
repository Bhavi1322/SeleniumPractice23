package stringexampleday18;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program stsrts");
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
