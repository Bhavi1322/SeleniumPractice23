package AssignmentString;

public class PalindromeString {

	public static void main(String[] args) {
		String str="Bhavika";
		int start=0;
		int end=str.length()-1;
		boolean isPalindrme=true;
		while(start<end) {
			if(str.charAt(start)!=str.charAt(end)) {
				//isPalindrome=false;
			//	break
			}
		      start++;
		       end--;
	}       
	
	     //if(isPalindrome) {
	      System.out.println("Palindrom");
	  //   }else {
	    	 System.out.println("Not a Palindrome");
	     

	     }
}
