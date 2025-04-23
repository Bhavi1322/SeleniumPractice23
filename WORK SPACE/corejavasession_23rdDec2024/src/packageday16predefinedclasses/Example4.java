package packageday16predefinedclasses;
  class Testing{
	  void manualTesting() {
		  System.out.println("I am a manual Tester");
	  }
  }
public class Example4 {
       static int age=25;
       static Testing t2=new Testing();
	public static void main(String[] args) {
		System.out.println("Program Starts");
		Example4 ref=new Example4();
		ref.calling();
		System.out.println("SGV of Example4 class age is"+Example4.age);
		Testing t1=new Testing();
		t1.manualTesting();
		Example4.t2.manualTesting();
	//classname.staticRefofTestingClass.nonstaticMethodOfTestingClass
		System.out.println("Program ends");
 //classname.staticRefofTestingClass.nonstaticMethodOfTesttingClass
		System.out.println("I am error msg");
	}
    void calling() {
    	System.out.println("I am calling from Example4");
    }
}
