package packageday7loops;

public class Assignment2 {

	public static void main(String[] args) {
		   int rem=0,rev=0;
           for(int num=123;num!=0;num=num/10);
	               rev=rev*10+rem;
	
	       System.out.println("Reverse number is:"+rev);
                    
               int num=123,rev1=0,rev2=0;
	              for(;num!=0;)
	                       rem=num%10;
	                       rev=rev*10+rem;
	                       num=num/10;
	                    		   
	       System.out.println("Reverse number is:"+rev);
	       
	       
	}	       
	       
}       