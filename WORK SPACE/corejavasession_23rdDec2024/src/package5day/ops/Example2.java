package package5day.ops;

public class Example2 {

	public static void main(String[] args) {
		   int num1=55,num2=11;
	       boolean cond1=(num1==num2);
           boolean cond2=(num1>num2);
           System.out.println("Condition1:"+cond1);//f
           System .out.println("Condition2:"+cond2);//t
           boolean res1=(cond1 && cond2);//f
           boolean res2=(cond1 ||cond2 );//t
           
           System.out.println("Result1:"+res1);
           System.out.println("Result2:"+res2);
           
           System.out.println((num1!=num2)&&(num1>=num2));
      //t                                              //t
           System.out.println((num1!=num2)||(num1>=num2));
       //t                                             //t
           
           
	}         
           
           
}          
           
           
           