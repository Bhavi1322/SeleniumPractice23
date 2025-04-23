package day20exceptionhandling;

public class CustomExceptionExample2 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		display();
		checkAge(15);
		System.out.println("Program Ends");
		
	}
   static void display() {
	   System.out.println("I am display method");
		   checkAge(25);
   }
     static void checkAge(int age) {
    	 if(age<18) {
    		 try {
    		      throw new BhavikaException("sorry, your age is below 18....");
    		 }catch(BhavikaException e) {
    			 e.printStackTrace();
    		 }
    	 }else {
    		    System.out.println("you are Welcome,as your age validation is completed...");
    	 }
     }



	}


