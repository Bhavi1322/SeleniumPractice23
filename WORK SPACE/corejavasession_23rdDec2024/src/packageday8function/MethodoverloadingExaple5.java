package packageday8function;

public class MethodoverloadingExaple5 {

	public static void main(String[] args) {
		    addition();
		    addition(25,36);

	}
   static double addition(int num1,int num2) {
	           int res=num1+num2;
	           System.out.println("Number1:"+num1);
	           System.out.println("Number2:"+num2);
	           return res;
	   
   }
   
}
