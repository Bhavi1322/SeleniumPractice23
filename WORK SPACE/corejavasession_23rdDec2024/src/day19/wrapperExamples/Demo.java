package day19.wrapperExamples;

public class Demo {
   private Demo() {
	   System.out.println("I am demo class cons....");
   }
   static Demo d1=new Demo();
   static Demo getInstance() {
	   return d1;
   }
   void calling() {
	   System.out.println("I am calling from Demo class...");
   }
   int age=101;
	public static void main(String[] args) {
		//Demo ref=new Demo();
		
		Demo ref=Demo.getInstance();
		ref.calling();
		System.out.println("Age:"+ref.age);
		ref.age=501;
		System.out.println("****************************************");
		Demo ref2=Demo.getInstance();
		System.out.println("Updated age:"+ref2.age);

	}

}
