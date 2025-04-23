 
public class Testing { 
	void callme(int num) {
		System.out.println(num+"Calling....");
	}
     final void display() {
    	 System.out.println("I am display of Testing class");
     }
     }
    class Inheritance11Final extends Testing{
    	//final method ca't be overridden
    	//void display(){
    	//System.out.println("I am display of Inheritance11Final class");
    void cllme(int xyz) {
    	System.out.println("Calling...."+xyz);
    	super.callme(456);
    }		
	public static void main(String[] args) {
		    Inheritance11Final t1=new Inheritance11Final();
		    t1.callme(123);
		    t1.display();
	}
	}

