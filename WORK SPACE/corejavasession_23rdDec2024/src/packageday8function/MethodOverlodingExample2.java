package packageday8function;

public class MethodOverlodingExample2 {

	public static void main(String[] args) {
		      MethodOverloadingExample2 ref ;
	MethodOverloadingExample2();
	          ref.addition();
	          ref.addition(75,36f,25);

	}
    void addition() {
    	int num1=20,num2=40,res=num1+num2;
    	System.out.println("Number1:"+num1);
    	System.out.println("Number2:"+num2);
    	System.out.println("Result:"+res);
    }
    void addition(int num1,int num2) {
    	int res=num1+num2;
    	System.out.println("Number1:"+num1);
    	System.out.println("Number2:"+num2);
    	System.out.println("Result:"+res);
    } 
    void addition(float num1,int num2) {
    	double res=num1+num2;
    	System.out.println("Number1:"+num1);
    	System.out.println("Number2:"+num2);
    	System.out.println("result:"+res);
    }
    void addition(int num1,float num2) {
    	   double res=num1+num2;
    	   System.out.println("Number1:"+num1);
    	   System.out.println("Number2:"+num2);
    	   System.out.println("Result:"+res);
    }
}
