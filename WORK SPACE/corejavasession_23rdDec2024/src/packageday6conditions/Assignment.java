package packageday6conditions;

public class Assignment {

	public static void main(String[] args) {
           int x=10,y=20,temp;
	       System.out.println("x:"+x);
           System.out.println("y:"+y);
           x=x+y;//30
           y=x-y;//10
           x=x-y;//20
                   //or
           temp=x;
           x=y;
           y=temp;
           System.out.println("After swap,x:"+y);
           System.out.println("After swap,y:"+x);
           
           }           
           
           
           }          
           
           