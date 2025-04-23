package packageday8functio;

public class sample1 {

	public static void main(String[] args) {
		    System.out.println("Program Starts");
		    //displayAutomationCourseContent();
		               //or
		    sample1.displayAutomationCourseContent();
		    System.out.println("****************************************");
		    getInterest();
		    System.out.println("*****************************************");
		    getInterest2(650000,7,9);
		    System.out.println("***********************************************");
		    getInterest2(95000,7,10.5);
		    System.out.println("Program Ends");
	}


public static void getInterest2(int p,int t,double r) {//int p=650000;t=7;double r=9.5;
        double res;
        res=(p*r*t)/100;
        System.out.println("Principal Amount is:"+p);
        System.out.println("Interest is:"+r);
        System.out.println("Interest on principal Amount is:"+res);
        System.out.println("Final Account with interest:"+(p+res));	
}

   public static void getInterest() {
	     int p=550000,t=5;
	     double r=8.5,res;
	     res=(p*r*t)/100;
	     System.out.println("Principal Amount is:"+p);
	     System.out.println("Interest on Principal Amount is:"+res);
	     System.out.println("Final Account with interest:"+(p+res));
   }
    static void dislayAutomationCourseContent() {
    	System.out.println("Welcome to automation session");
    	System.out.println("You are learning Core Java");
    	System.out.println("Will start selenium after Core Java");
    	
    }

    }












