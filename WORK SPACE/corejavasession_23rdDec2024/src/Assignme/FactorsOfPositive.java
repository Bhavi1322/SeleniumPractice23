package Assignme;

public class FactorsOfPositive {

	public static void main(String[] args) {
		    System.out.println("Program Starts");
		    System.out.println("Enter a positive integer:");
		    int num=60;
		    System.out.println("Factors of"+num+"are");
		    for(int i=1;i<=num;i++) {
		    	if(num%i==0) {
		    System.out.println(i);
		    System.out.println("Program Ends");
		    	}
		    }

	}

}
