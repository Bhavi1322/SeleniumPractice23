
public class Vehicle {
	public void wheels() {
		System.out.println("I have wheels");
	}
	}
   //first child class of vehicle class
  class bike extends Vehicle {
	  public void countw1() {
		  System.out.println("I am a bike and has 2 wheels");
	  }
	  }
//second child class of vehicle class
  class Car1 extends Vehicle{
	  public void countwlc() {
		  System.out.println("I am a car and has 4 wheels");
	  }
	  }
  //third child class of vehicle{
  class scooter extends Vehicle{
	  public void countwls() {
		  System.out.println("I am a scooter and has 2 wheels ");
	  }
	  }
  class Inheritance4{
	public static void main(String[] args) {
		Car1 c = new Car1();//object of car class
		c.wheels();
		c.countwlc();
		bike b=new bike();//object of bike class
		b.wheels();
		b.countw1();
		scooter sc=new scooter();//object of scooter class
		sc.countwls();
		sc.wheels();
		
		

	}

}
