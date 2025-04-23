package day20exceptionhandling;

public class FinallyExample5 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=10,num2=0,res;
		System.out.println("Number1:"+num1);
		System.out.println("Number2:"+num2);
		System.exit(0);//forcefully terminating program
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
	    	System.out.println("hi,I am finally block.I will be always executed....");
	    	
	    }
	    System.out.println("Program Ends");
		}

	

	

	}


