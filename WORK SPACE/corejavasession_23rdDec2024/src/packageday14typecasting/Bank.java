package packageday14typecasting;

public class Bank {
   float getRateOfInterest() {
	   return 0;
   }
   class SBI extends Bank{
	   float getRateOfInterest(){
		   return 0;
		   
	   }
   }
   class ICICI extends Bank{
	   float getRateofInterest() {
		   return 9.7f;
	   }
   }
   public class Runtime4{
	public static void main(String[] args) {
	Bank b=new SBI();//upcasting
	System.out.println("SBI Rate of Interest:"+getRateofInterest());
	b=new ICICI();//up casting
	System.out.println("ICICIRate of Interest:"+getRateofInterest());
	b=new AXIS();//up casting
	System.out.println("AXIS Rate of Interest:"+getRateofInterest());
		

	}
   }
}
