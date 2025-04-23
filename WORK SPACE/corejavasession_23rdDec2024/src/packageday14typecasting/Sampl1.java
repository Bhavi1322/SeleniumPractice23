package packageday14typecasting;

public class Sampl1 {
      double test1() {
    	  System.out.println("Running test1");
    	  return 4;
      }
      public class PrimitiveCasting6{
	public static void main(String[] args) {
		System.out.println("Program starts");
		Sampl1 s=new Sampl1();
		int res=(int)s.test1();
		System.out.println("raturn valie="+res);
		System.out.println("Program Ends");

	}
      }
}
