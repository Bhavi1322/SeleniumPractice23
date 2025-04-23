package packageday7loops;

public class Example10{ 

	public static void main(String[] args) {
	       System.out.println("Program Starts");
	       char symbol='%';
	       int num1=15,num2=5,res;
	       System.out.println("Number1:"+num1);
	       System.out.println("number2:"+num2);
	       switch(symbol) {
	       case'/':
	    	     res=num1/num2;
	    	     System.out.println("Division result is:"+res);
	    	     break;
	             case'%':
	            	 res=num1%num2;
	            	 System.out.println("Mod result is;"+res);
	            	 break;
	             case'-':
	            	 res=num1-num2;
	            	 System.out.println("Subs result is:"+res);
	            	 break;
	             case '+':
	            	 res=num1+num2;
	            	 System.out.println("Addition result is:"+res);
	            	 default:
	            		 System.out.println("Invalid symbol");
	            		 
	       }
	            		 System.out.println("Program Ends");
	             
	}
	
	
}
	       
	       
	
	    	   
	    	   
	    	   
	    	   
	       
	       
	       
	       
	       
	       



