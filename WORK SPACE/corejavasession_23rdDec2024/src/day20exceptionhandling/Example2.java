package day20exceptionhandling;

public class Example2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=10,num2=0,res;
		System.out.println("number1:"+num1);
		System.out.println("number2:"+num2);
        try {
        	System.out.println("Welcome to try block");
        	res=num1/num2;//abn0rmal statement
        	System.out.println("Result:"+res);
        	System.out.println("Good Bye try block");
        }catch(ArithmeticException e) {
        	System.out.println("Welcome to catch block");
        	System.out.println("Exception type and error msg:"+e);
        	System.out.println("Error msg:"+e.getMessage());
        	e.printStackTrace();//print actual exception with details
        	System.out.println("Exception handled.....");
        }
        System.out.println("Program Ends");
	}

}
