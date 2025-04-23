package packageday8functio;

public class Sample3 {

	public static void main(String[] args) {
	         System.out.println("Program Starts");
	         int principal=950000,time=7;
	         double roi=10.5;
	         double intrest=getInterest2(principal,time,roi);//itwill execute metod body and it will store return value for future use
	         System.out.println("Intrest to be paid:"+intrest);
	         System.out.println("Final amount to be paid:"+(principal+intrest));
	         System.out.println("Program Ends");

	}
public static double getInterest2(int p, int t,double r) {//int p=principal=950000; |int t=time=7;| double r=roi=10.5;
	double res=(p*r*t)/100;
	System.out.println("Principal Amount is:"+p);
	System.out.println("Interest is:"+r);
	return res;
	
}
}
