package day20exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		checkAge(15);
		System.out.println("Program ends");
	}
     static void checkAge(int age) {
    	 if(age<18) {
    		 throw new ArithmeticException("sorry,your age is below 18....");
    	 }else {
    		 System.out.println("you are welcome,as your age validation is completed..");
    	 }
     }
}
