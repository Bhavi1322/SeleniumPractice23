package day20exceptionhandling;
 import java.util.Scanner;
public class Example3 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1,num2,res;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number1: ");
		num1=scn.nextInt();
		System.out.println("Enter number2: ");
		num2=scn.nextInt();
		System.out.println("number1:"+num1);
		System.out.println("number2:"+num2);
		try {
			System.out.println("Welcome to try block");
			res=num1/num2;//abnormal ststement
			System.out.println("Result:"+res);
			System.out.println("Good Bye try block");
		}catch(Throwable e) {//when you are not sure about exception use throwable
			System.out.println("Welcome to catch block");
			System.out.println("Exception type and error msg:"+e);
			System.out.println("Error msg:"+e.getMessage());
			e.printStackTrace();//print actual exception with details
			System.out.println("Exception handled......");
		}
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