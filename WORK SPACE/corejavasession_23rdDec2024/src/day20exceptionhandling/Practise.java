package day20exceptionhandling;

public class Practise {
	public static void main(String[] args) {
	System.out.println("Program start");
  int num1=50,num2=0,res;
  System.out.println("Number1 ="+num1);
  System.out.println("Number2="+num2);
  try {
  res=num1/num2;//abnormal statement
  System.out.println("Result="+res);
  }catch(ArithmeticException e) {
	  System.out.println("Exception error msg :"+e);
	  System.out.println("Error msg:"+e.getMessage());
  }
  System.out.println("Program ends");
	}
}
