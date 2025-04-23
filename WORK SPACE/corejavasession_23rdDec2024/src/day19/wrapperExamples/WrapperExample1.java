package day19.wrapperExamples;

public class WrapperExample1 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		int age=25;
		//Boxing Operation
		//Integer Obj1=new Integer(age);//has been deprecated since version 9and marked for removal
		
		Integer obj1=age;
		Integer obj2=30;
		System.out.println("age:"+age);
		System.out.println("obj1:"+obj1);
		System.out.println("obj2:"+obj2);
		System.out.println("age==obj1 :"+(age==obj1));
		
		Double obj3=25.6;
		Character obj4='A';
		Boolean obj5=true;
		
		System.out.println("************************Unboxing****************************");
        int a=obj1.intValue();
        double b=obj3.doubleValue();
        
	}

}
