package Overridings;

public class Animal2 {
	Animal2(){
	}
	public void move() {
		System.out.println("Animals can move");
	}
	void display() {
		System.out.println("I am display()of Animal2 class");
	}
}
class dog2 extends Animal2{
	public void move() {
		System.out.println("Dogs can walk and run");
		display();
		//Animal2 a1=new Animal2();//instance of Animal2 class
		// a1.move();
		super.move();
	}
	}
	
	
   class Overriding2{
	public static void main(String args[]) {
		Animal2 b=new dog2();//Animal reference but dog object
		b.move();//
		

}

	
	}


