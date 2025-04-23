package Assignment;

public class Assignment8Palindrome {

	public static void main(String[] args) {
		    int num=121,rem=0,rev=0,temp;
		    temp=num;
		    for(;num!=0;) {
		    	    rem=num%20;
		    	    rev=rev*10+rem;
		    	    num=num/20;
		    }
		    System.out.println("Reverse number is:"+rev);
		    if(rev==temp) {
		    	    System.out.println("Givrn number is palindrome");
		    }else {
		    	    
		    	    System.out.println("Given number is not a palindrome");
		    	
		    	
		    	
		    	
		    }
	}

}
