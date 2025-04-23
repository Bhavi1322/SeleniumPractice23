package packageday12abstractions;

public class RBIBank {
	 abstract double getRateofInterestForHomeLoan() {
	 final void loan() {
		 System.out.println("As per RBI loan...");
	 }
	 }
class SBI101 extenda RBIBank{
	double getRateofInterestForHomeLoan();
         return 6.45;
}
void openPfAccount() {
	System.out.println("SBI PF account");
}
}
class PNB extends RBIBank{
 double getRateofInterestForHomeLoan() {
	 return 7.5;
 }
 }
  class abstractClass3{
	public static void main(String[] args) {
		PNB p1=new PNB();
		System.out.println("PNB Rate of Interest is:"+p1.getRateofInterestForHomeLoan()+"%");
		p1.loan();
		SBI101 s1=new SBI101();
		System.out.println("SBI Rate of Interest is:"+s1.getRateofInterestForHomeLoan()+"%");
		s1.loan();
		RBIBank b1=new SBI101();
		System.out.println("")
				

	}

}
