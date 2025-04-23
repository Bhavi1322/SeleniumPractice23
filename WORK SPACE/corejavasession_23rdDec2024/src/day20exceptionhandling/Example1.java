package day20exceptionhandling;

public class Example1 {

	public static void main(String[] args) {
		
		System.out.println("Program Starts");
		int num1=10,num2=0,res;
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		res=num1/num2;//abnormal statement
		System.out.println("Result:"+res);
		System.out.println("Program Ends");
		
	}

}
/*
Exception in thread "main" java.lang.ArithmeticException: / by zero
	at day20.exceptionhandling.Example1.main(Example1.java:10)

Exception Type: java.lang.ArithmeticException
Error msg: by zero
Details: day20.exceptionhandling.Example1.main(Example1.java:10)
*/