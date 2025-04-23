package Overridings;

public class Animal1 {
	Animal1(){
	}
	public void move() {
		System.out.println("Animals can move");
	}
}
class dog extends Animal1{
	dog(){
		super();
	}
	
	@Override
	 public void move() {
		System.out.println("Dogs can walk and run");
	}
	public void bark() {
		System.out.println("Dogs can bark");
	}
	}
   class Overriding1{
	public static void main(String[] args) {
		Animal1 a=new Animal1();//Animal reference and object
		a.move();
		dog b=new dog();//Dog reference but dog objec
		b.move();
		b.bark();
		System.out.println("*************************************");
		Animal1 a1=new dog();//you will get dog class move(),
		bark();
		a1.move();
		//a1.bark();//a1.compile time error since b's reference type Animal doesn't
	}

}
