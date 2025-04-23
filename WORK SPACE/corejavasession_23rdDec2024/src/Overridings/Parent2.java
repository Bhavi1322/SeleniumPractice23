package Overridings;

public class Parent2 {
	//private method are not overridden,because private member doesn't participate in inheritance
	private void m1() {
		System.out.println("From parent m1()");
	}
protected void m2() {
	System.out.println("From parent m2()");
}
}
  class Child2 extends Parent2{
	  //new m1() method no overriding here as its a private method,unique to child class
	  public void m1() {
		  System.out.println("From Child m1()");
		}
	  //overriding method with more accessibiliy
	  @Override
	  protected void m2() {
		  System.out.println("From Child m2()");
		}
	  }
  //Driver class
  class Overriding6{
	public static void main(String[] args) {
		Parent2 obj1=new Parent2();
		obj1.m2();
		//obj1.m1();//compile time error as private members can't be access from outside the class
		Parent2 obj2=new Child2();
		obj2.m2();
		Child2 obj3=new Child2();
		obj3.m2();
		obj3.m1();

	}

}
