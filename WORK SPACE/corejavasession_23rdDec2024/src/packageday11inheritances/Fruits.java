package packageday11inheritances;
//parent class
public class Fruits {
	int fruitAge;
		Fruits(){
			System.out.println("fruit class cons..");
			fruitAge=7;
		}
	public void taste() {
		System.out.println("Fruits are sweet");
		}
	//child class of fruit
	class Orange extends Fruits{
		int fruitAge;
		Orange(){
			//super();//java compiler will write default super() 
			System.out.println("Orange class cons...");
			fruitAge=5;
		}
	   public void taste() {
		     System.out.println("Orange are sweet");
	   }
	   void shape() {
		   System.out.println("Orange are sweet");
		   System.out.println("Orange fruitAge:"+fruitAge);//5
		   taste();//calling orange class taste method
		   System.out.println("*****************************");
		   Fruits f1=new Fruits();
		   f1.taste();
		   System.out.println("Age from fruits class:"+f1.fruitAge);
		   System.out.println("###########################");
		   super.taste();
		   System.out.println("Age from fruite class:"+super.fruitAge);
		   class Inheritance7{
	public static void main(String[] args) {
		 System.out.println("************************************");
		 Orange O1=new orange();
		 O1.shape();
		 System.out.println("*************************************");
	}
		   }
	   }
	}

}
