package day20exceptionhandling;
class BhavikaException extends Exception{
	  BhavikaException(String msg){
		  super(msg);
	  }
}
public class CustomExceptionExample1 {

	public static void main(String[] args) throws BhavikaException{
		System.out.println("Program starts");
		display();
		checkAge(15);
		System.out.println("Program Ends");
		
	}
   static void display() {
	   System.out.println("I am display method");
	   try {
		   checkAge(25);
	   }catch(BhavikaException e) {
		   e.printStackTrace();
	   }
   }
     static void checkAge(int age) throws BhavikaException{
    	 if(age<18) {
    		      throw new BhavikaException("sorry, your age is below 18....");
    	 }else {
    		    System.out.println("you are Welcome,as your age validation is completed...");
    	 }
     }
}
