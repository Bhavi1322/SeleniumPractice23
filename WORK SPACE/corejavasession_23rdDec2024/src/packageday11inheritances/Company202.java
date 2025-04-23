package packageday11inheritances;
//parent class
public class Company202 {
	void display() {
		System.out.println("I am comoany class display()...");
	}
	}
  //child class of company 
class Employee202 extends Company202{
	//Overridden method
	@Override
	void display() {
		System.out.println("I an Employee class display()...");
	}
	void callme() {
		display();//Employee(child)display method
		super.display();//Company202(parent)display method
		System.out.println("I am Employee class callme()...");
	}
		
		
	}
 class Inheritance9{
	public static void main(String[] args) {
		Employee202 e1=new Employee202();
		e1.display();
		e1.callme();
		System.out.println("************************************");
		Company202 c1=new Company202();
		c1.display();
		System.out.println("**********************************************");
		Company202  e2=new Employee202();
		e2.display();
		
	}

}
