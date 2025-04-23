package packageday8functio;

public class sample2 {

	public static void main(String[] args) {
		    System.out.println("Program Ends");
		    System.out.println("**************************************");
		    getInterest(650000,7,9);
		    System.out.println("*******************************************");
		    //getInterest2(950000,7,10.5);//it will execute method body but its return value won't be used
		    //or
		    //System.out.println("Intrest to be paid:"+getInterest(950000,7,10.5);//it will execute method body and it will also print return value
		    //or
		    double intrest=getInterest2(950000,7,10.5);//if will eecute method body and it will store return value for future use
		    System.out.println("Intrest to be paid:"+intrest);
		    System.out.println("Final amount to be paid"+(950000+intrest));
		    System.out.println("Program Ends");
	}
   public static double getInterest2(int p,int t, double r) {//int p=650000;int t=7;double r=9.5;
	   double res (p*r*t)/100;
	   System.out.println("Principal Amount is:+p");
	   System.out.println("Interest is:"+r);
	   return res;	   
   }
   public static void getInterest(int p,int t, double r) {//int p=650000;int t=7; double r=9.5;
	   double res;
	   res=(p*r*t)/100;
	   System.out.println("Principal Amount is:"+p);
	   System.out.println("Interest is:"+r);
	   System.out.println("Interest on Principal Amount is:"+res);
	   System.out.println("Final Account with interest:"+(p+res));
   }
   
   
   
}
