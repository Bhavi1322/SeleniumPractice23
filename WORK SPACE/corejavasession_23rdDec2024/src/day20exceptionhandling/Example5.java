package day20exceptionhandling;
import java.util.Scanner;
public class Example5 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int[]num=new int[3];
		int num1,num2,res;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number1:");
		num1=scn.nextInt();
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		try {
			System.out.println("Welcome to try block");
			num[3]=num1/num2;
			System.out.println("Good Bye try block");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Welcome to catch block");
			System.out.println("Exception type and error msg:"+e);
			System.out.println("Error msg:"+e.getMessage());
			//e.printStackTrace();//print actual exception with details
			System.out.println("Exception handled......");
		}catch(ArithmeticEception e){
			System.out.println("Welcome to catch block");
			System.out.println("Exception type and error msg:"+e);
			System.out.println("Exception handled.......");
		}catch(Throwable e) {
			System.out.println("Welcome to catch block");
			System.out.println("Exception type and error msg:"+e);
			System.out.println("Exception handled.......");
		
	}
            System.out.println("Program Ends");

	}

}
