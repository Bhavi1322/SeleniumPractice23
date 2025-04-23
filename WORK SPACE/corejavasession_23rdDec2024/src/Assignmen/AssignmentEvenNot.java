package Assignmen;

public class AssignmentEvenNot {
	//method to check if a number is even or not
	public static boolean isEvent(int number) {
	      return number%4==0;	
	}
	public static void main(String[] args) {
	//test the isEvent method with some numbers
		  int number=20;
		  if(isEvent(number)) {
			  System.out.println(number+"is even");
		  }else {
			  System.out.println(number+"is not");
			  
		  }
				  
	}

}
