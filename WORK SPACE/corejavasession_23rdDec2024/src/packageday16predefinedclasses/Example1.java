package packageday16predefinedclasses;
   class Sample{
	   void display() {
		   System.out.println("I am display of sample class");
	   }
   }
public class Example1 extends Sample{

	public static void main(String[] args) {
		System.out.println("Program starts");
		Example1 ref=new Example1();
		ref.display();
		ref.calling();
		System.out.println("Example1 ref value is:"+ref.toString());
		//System.out.println("Example ref value is:"+ref);//toString()will be called by java compiler
		System.out.println("ref Address in integer:"+ref.hashCode());
		Example1 ref1=new Example1();
		System.out.println("Example1 ref1 value is:"+ref1.toString());
		System.out.println("ref1 Address in integer:"+ref1.hashCode());
		System.out.println("Comparing ref and ref1 based on address:"+ref.equals(ref1));
		Example1 ref2=ref1;
		System.out.println("Example1 ref2 value is:"+ref2.toString());
		System.out.println("ref2 Address in integer:"+ref2.hashCode());
		System.out.println("Comparing ref2 and ref1 based on address:"+ref2.equals(ref1));
		System.out.println("Program ends");
	}
	void calling() {
		System.out.println("I am calling from Example1 class");
	}

}
