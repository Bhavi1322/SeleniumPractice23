package packageday11inheritances;

public class B2 {
	void msg() {
		System.out.println("Welcome");
	}
	}
   class A2{
	   void msg() {
		   System.out.println("Hello");
	   }
   }
   class Inheritance5 extends A2,B2{
	   Inheritance(){
		   super();//confusion
	   }

	public static void main(String[] args) {
		Inheritance5 obj=new Inheritance5();
	}

}
