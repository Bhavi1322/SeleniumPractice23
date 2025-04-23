package packageday14typecasting;

public class GrandFather {
       void myHome() {
    	   System.out.println("Grandfather's home");
       }
     class Father extends GrandFather{
    	 void myCar() {
    		 System.out.println("Father's car"); 
    	 }
     }
     class Child extends Father{
    	 void myBike() {
    		 System.out.println("Child's bike");
    	 }
     }
     public class NonPrimitiveCasting1{
	public static void main(String[] args) {
	       Child ref1=new Child();
	       ref1.myBike();
	       ref1.myCar();
	       ref1.myHome();
	}

}
