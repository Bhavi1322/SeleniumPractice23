
public class FruitA {
   int fruitAge;
   FruitA(){
	   System.out.println("fruitA class cons...");
	   fruitAge=7;
   }
   public void taste() {
	   System.out.println("Fruits are sweet");
   }
}
//child class of fruit
   class mango extends FruitA{
	   int fruitAge;
	   mango(){
		   //super();//java compiler will write default super()
		   System.out.println("mango class cons..");
		   fruitAge=5;
	   }
	   @Override
	   public void taste() {
		   System.out.println("Mango are tart in taste");
	   }
	   public void shape() {
		   System.out.println("Mango is round");
	   }
   }
    class Inheritance8{
	public static void main(String[] args) {
		System.out.println("******************************************");
		mango m1=new mango();
		m1.shape();
		m1.taste();
		System.out.println(m1.fruitAge);
		
	FruitA f1=new FruitA();
	f1.taste();
	System.out.println(f1.fruitAge);
	
	System.out.println("===================================");
	                 FruitA f2=new mango();
	                 f2.taste();//overrided body of taste method
	                 System.out.println(f2.fruitAge);
	                 System.out.println("***********************");
		
	}

}
