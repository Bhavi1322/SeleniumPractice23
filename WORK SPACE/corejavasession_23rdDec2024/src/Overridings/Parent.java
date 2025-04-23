package Overridings;
//Base Class or parent class or super class
public class Parent {
  void show() {
	  System.out.println("Parent's show()");
  }
  }
//Inherited class or child class or sub class 
class Child extends Parent{
	//this method overrides show() of parent
	@Override
	void show() {
		System.out.println("child's show()");
	}
}
//Driver class
class Overriding5{
	public static void main(String[] args) {
		//if a parent type reference refers to a Child object Child's show() is called.This is called Run TIME
		//POLYMORPHISM.
		Parent obj2=new Child();
		obj2.show();//child's show()
	}

}
