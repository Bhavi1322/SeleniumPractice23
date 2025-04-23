package packageday11inheritances;
//super class/parent class/base class
public class Grandfather {
	        Grandfather(){
	        	System.out.println("I am Grandfather cons...");
	        }
void myhome() {
	System.out.println("I am home of Grandfather");
}
}
//subclass/child class/derived class
  class Father extends Grandfather{
	  Father(double d){
		  //super();//if we dont wirte this dn java compiler will write by default super()
		  System.out.println("I am Class Father cons....");
	  }
	  void myCar() {
		  System.out.println("I am car  of Father");
	  }
  }
  class Child1 extends Father{
	  Child1(int i){
		  super(12.34);
		  System.out.println("I am Class Child constrcuor...");
	  }
		  
	  
  void myBike() {
	 
  }
	  System.out.println("I am bike of child");
  }
  class Inheritance6{
	public static void main(String[] args) {
		System.out.println("**********************************");
		Child1 c1=new Child1(21);//home,car&bike
		c1.myhome();
		c1.myCar();
		c1.myBike();
		System.out.println("****************************************");
		//creating an object or instance of child most class and referred by its parent
		Father f1=Father(254.1); 
		f1.myCar();
		f1.myhome();
		Father f2=new Child1(25);//myHome,myCar,myBike
		f2.myCar();
		f2.myhome();
		Father f1 = c1;//Father f1=c1=new Child1(21);home,car but bike will not be visible/accessible to father
		f1.myhome();
		f1.myCar();
		//f1.myBike();//error as its a property fo child
		System.out.println("*****************************************************");
		//creating an object or instance of child most class and referred by its parent
		Grandfather g1=c1;//Grandfather g1=c1=new Child1(21);
		//home but car & bike will not be visible/accessible to Grandfather
		g1.myhome();
		//g1.mycar();
		//g1.myBike();
		System.out.println("**********************************");
		
	}



