package packageday16predefinedclasses;
  class Sample3{
	  @Override
	  public String toString() {
		  return "HelloFromExample2";
	  }
	  @Override
	  public int hashCode() {
		  return 101;
	  }
	  @Override
	  public boolean equals(Object obj) {
		  return true;
	  }
	  void display() {
		  System.out.println("I am display of sample class");
	  }
  }
public class Example3 extends Sample3{

	public static void main(String[] args) {
		System.out.println("Program starts");
		Example3 ref=new Example3();
		System.out.println("Example1 ref value is:"+ref);//toString()will be called by java compiler
		System.out.println("ref Address in integer:"+ref.hashCode());
		Example3 ref1=new Example3();
		System.out.println("Example1 ref1 value is:"+ref1.toString());
		System.out.println("ref1 Address in integer:"+ref1.hashCode());
		System.out.println("Comparing ref and ref1 based on address:"+ref.equals(ref1));
		Example3 ref2=ref1;
		System.out.println("Example1 ref2 value is:"+ref2.toString());
		System.out.println("ref2 Address in integer:"+ref2.hashCode());
		System.out.println("Comparing ref2 and ref1 based on address:"+ref2.equals(ref1));
		Sample3 s1=new Sample3();
		Sample3 s2=new Sample3();
		System.out.println("Sample3 s2 value is:"+s2);
		System.out.println("s2 Address in integer:"+s2.hashCode());
		System.out.println("Comparing s1 and based on address:"+s1.equals(s2));
		System.out.println("Program ends");
	}
	void calling() {
		System.out.println("I am calling from Example1 class");

	}

}
