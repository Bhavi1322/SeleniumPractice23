package Overridings;

public class Parent4 {
	//static method in class which will be hidden in subclass 
	static void m1(){
	System.out.println("From parent"+"static m1()");
}
//non-static method which will be overridden in derived class
	void m2() {
		System.out.println("From parent"+"non-stastc(instance) m2()");
	}
	class Child4 extends Parent4{
		//this method hides m1() in Parent
		static void m1() {
			System.out.println("From Child"+"stastc m1()");
		}
		//This method overrides m2() in parent 
      @Override
		public void m2() {
			System.out.println("From Child"+"non-stastc(instance) m2()");
		}
		}
	//Driver class
	class Overriding8{
	public static void main(String[] args) {
		Parent4 obj1=new Child4();
		obj1.m1();//java compiler will convert it into--->
		Parent4.m1();
		//Here overriding works and child's m2() is called
		obj1.m2();
	}

}
}