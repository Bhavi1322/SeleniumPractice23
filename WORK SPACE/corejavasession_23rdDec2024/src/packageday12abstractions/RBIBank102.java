package packageday12abstractions;

public class RBIBank102 {
     final abstract double getRateOfInterestForHomeLoan();
     //abstract mean must be override
     //final means can't be override
}
  class SBI102 extends RBIBank{
	  double getRateOfInterestForHomeLoan() {
		  return 6.45;
	  }
	  }
  class abstractClass4{
	public static void main(String[] args) {
		

	}

}
