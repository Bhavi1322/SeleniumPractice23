package Assignment3;

public class Assignmentrever {
	//Function to reverse a given(number)
	public static int reversen(int number) {
		int reversed=0;
		//loop to extract digits and reverse the number
		while (number!=0) {
			int digit=number%10;
		//	Get the last digit
			reversed=reversed*10+digit;
			//append the digit to the reversed number
			number/=10;//Remove the number
		}
	
             return reversed;
	}
	public static void main(String[] args) {
		    int number=98765;//int reversednum=reversenum(number);
		    System.out.println("Originai number:"+number);
		    System.out.println("Reversed number:"+ number);
		
	
	}

}
 