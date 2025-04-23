package packageday8function;

public class MethodOverloadingExample1 {

	public static void main(String[] args) {
		addition();
		addition(75.36f,25);
	}
     static void addition() {
    	   int num1=30,num2=50,res=num1+num2;
    	   System. out .println("Number1:"+num1);
    	   System.out.println("Number2:"+num2);
    	   System.out.println("Result:"+res);
     }
   static void addition(int num1, int num2) {
	   int res=num1+num2;
	   System.out.println("Number1:"+num1);
	   System.out.println("Number2:"+num2);
	   System.out.println("Result:"+res);
   }
   static void addition(float num1,float num2) {
	      double res=num1+num2;
	      System.out.println("Number1:"+num1);
	      System.out.println("Number2:"+num2);
	      System.out.println("Result:"+res);
   }
   static void addition(int num1,float num2) {
	     double res=num1+num2;
	     System.out.println("Number1:"+num1);
	     System.out.println("Number2:"+num2);
	     System.out.println("Result:"+res);
   }
}
