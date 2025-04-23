package stringexampleday18;

public class Sample1 {

	public static void main(String[] args) {
		String s1="pune";
		String s2="pune";
		String s3="mumbai";
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		System.out.println("s3:"+s3);
		System.out.println("Compare s1 & s2 based on value:"+s1.equals(s2));
		System.out.println("Compare s1 & s2 based on address:"+(s1==s2));
		System.out.println("Compare s1 & s2 based on value:"+s1.equals(s3));
		System.out.println("Compare s1 & s2 based on address:"+(s1==s3));
		    String s4=new String("pune");
		    System.out.println("s4:"+s4);
		    System.out.println("Compare s1 & s4 based on value:"+s1.equals(s4));
		    System.out.println("Compare s1 & s4 based on address:"+(s1==s4));
		    System.out.println("*****************************************************");
		    String s5="Bangalore";
		    System.out.println("s5:"+s5+"has total char count as "+s5.length());
		    char indexZeroChar=s5.charAt(0);
		    System.out.println("Zero index char is:"+indexZeroChar);
		    for(int i=0; i<s5.length();i++) {
		    	System.out.println("char at index "+i+":"+s5.charAt(i));
		    }
		    System.out.println("***************************************************");
		    String s6="I am xyz,I am staying in pune,I am working QA";
		    System.out.println("s6:"+s6);
		    System.out.println(s6.replaceFirst("am" ,"xx"));
		    System.out.println(s6.replace("am" ,"xx"));
		    System.out.println("****************************************");
		    System.out.println("Bangalore substring from 1 to 5 index:"+s5.subSequence(1,5));
		    System.out.println("**************************************************8");
		    String x1="java";
		    String x2="selenium";
		    String x3=x1.concat(x2);
		    System.out.println("x1:"+x1);
		    System.out.println("x2:"+x2);
		    System.out.println("x3:"+x3);		
		   	String x4=x1+x2;
		    System.out.println("x4:"+x4);
		    String x5=x1+null;
		    System.out.println("x5:"+x5);//javanull
		    String x6=x1.concat(null);
		    System.out.println("x6:"+x6);//runtime error
		    System.out.println("******************************************");
		    	String a1="I am staying in pune,I am learnig java"	;
		    	System.out.println("is Chennai have'pune' :"+a1.contains("pune"));
		    	System.out.println("is Chennai ends with'java'? "+a1.endsWith("java"));
		    	System.out.println("what is the index of 'e' in Chennai :"+a1.indexOf("e"));
		    	System.out.println("what is the index of 'am' in Chennai :"+a1.indexOf("am"));
		    	System.out.println("what is the index of 'a' in Chennai after 8rd index:"+a1.indexOf('a',8));
		    	System.out.println("is a1 empty?:"+a1.isEmpty());
		    	System.out.println( a1.lastIndexOf('I'));
		    	System.out.println( a1.lastIndexOf('a',35));
		    	
		    		
		    		
		    		
		    		
		    		
		    		
		    		
		    
	}

}
