package packageday16predefinedclasses;
   class Sample2{
	   void display() {
		   System.out.println("I am display of sample class");
	   }
   }
public class Example2 extends Sample2{
	@Override
	public String toString() {
		return "HelloFromExaple2";
	}
	@Override
	public int hashCode() {
		return 101;
	}

	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example2 ref=new Example2();
		System.out.println("Example1 ref value is:"+ref);//toString()will be called by java compiler
		System.out.println("ref Address in integer:"+ref.hashCode());
		Example2 ref1=new Example2();
		System.out.println("Example1 ref1 value is:"+ref1.toString());
		System.out.println("ref1 Address in integer:"+ref1.hashCode());
		System.out.println("Comparing ref and ref1 based on address:"+ref.equals(ref1));
		Example2 ref2=ref1;
		System.out.println("Example ref2 value is:"+ref2.toString());
		System.out.println("ref2 Address in integer:"+ref2.hashCode());
		System.out.println("Comparing ref2 and ref1 based on address:"+ref2.equals(ref1));
		Sample2 s1=new Sample2();
		System.out.println("Sample2 s1 value is:"+s1);
		System.out.println("s1 Address in integer:"+s1.hashCode());
		Sample2 s2=new Sample2();
		System.out.println("Sample2 s2 value is:"+s2);
		System.out.println("s2 Address in integer:"+s2.hashCode());
		System.out.println("C0mparing s1 and s2 based on address:"+s1.equals(s2));
		System.out.println("Program ends");
	}
	void calling()	{
		System.out.println("I am calling from Example1 class");

	}

}
