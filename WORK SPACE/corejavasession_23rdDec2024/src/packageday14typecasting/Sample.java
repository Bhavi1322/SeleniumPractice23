package packageday14typecasting;

public class Sample {
	void test1(double d) {
		System.out.println("d value="+d);
	}
      void test1(int k) {
    	  System.out.println("k value="+k);
      }
        public class PrimitiveCasting5{
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Sample s=new Sample();
		s.test1(7);
		System.out.println("Program Ends");

	}

}
}