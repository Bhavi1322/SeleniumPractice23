package packageday11inheritances;
//parent class 
public class Fourwheelr {
//default constructor
	public void wheels() {
		System.out.println("I have 4 wheels");
	}
	}
   //child class of Fourwheelr and parent of maruti
   class Car extends Fourwheelr{
	   //default constructor with default super()
	   public void type() {
		   System.out.println("I'm car");
	   }
	   }
   //child class of car class
   class maruti extends Car{
	   //default constructor with default super()
	   public void company() {
		   System.out.println("I'm maruti");
	   }
   }
   class Inheritance3{
	public static void main(String[] args) {
		   maruti fr=new maruti();//object of child class
		   fr.company();
		   fr.wheels();
		   fr.type();
	}
	}


