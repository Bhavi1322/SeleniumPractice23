package day20exceptionhandling;

public class FinallyExample4 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=10,num2=10,res;
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
	    try {
	    	System.out.println("Welcome to try block");
	    	res=num1/num2;//abnormal statement
	    	System.out.println("Result:"+res);
	    	System.out.println("Good Bye try block");
	    }catch(ArithmeticException e) {
	    	System.out.println("Welcome to catch block");
	    	e.printStackTrace();//print actual exception with details
	    	System.out.println("Exception  handled........");
	    }finally {
	    	int i=25/0;
	    	System.out.println("hi,I am finally block.I will be always executed....");
	    	
	    }
	    System.out.println("Program Ends");
		}

	

	
	}

/*
finally execution:
	1. try block throws exception and catch block handle it
	2. try block throws exception and catch block doesn;t handle it
	3. no exception in try block
When finally block won;t be executed
	1. if before finally block use 
		System.exit(0);
	2. if exception comes in finally block
	3. if current process/thread is dead
*/
