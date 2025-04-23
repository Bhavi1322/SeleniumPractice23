package packageday8function;

public class MethodOverloadingExample4 {

	public static void main(String[] args) {
		    addition();
		    addition();
	}
    static void addition() {
    	int num1=10,num2=20,res=num1+num2;
    	System.out.println("Number1:"+num1);
    	System.out.println("Number2:"+num2);
    	System.out.println("Result:"+res);
    	
    }
    static int addition() {
    	  int num1=30,num2=40;
    	  int res=num1+num2;
    	  System.out.println("Number1:"+num1);
    	  System.out.println("Number2:"+num2);
    	  return res;
    }
}
