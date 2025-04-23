package packageday14typecasting;

public class PrimitiveCastin1 {
     public static void main(String[] args) {
    	 int myInt=9;//widenig implicit,when java compiler writes behalf of you-->double myDouble=(double)myInt;
    	 double myDouble=myInt;//internally java compile--->double myDouble=(double)myInt;
    	 
    	 double d=(double)myInt;//explicit widening
    	 System.out.println(myInt);//9
    	 System.out.println(myDouble);//9.0
    	 System.out.println(d);//90
    	 
    	 double salary=23400.6785685d;
    	 int sal=(int)salary;//narrowing,explicit
    	 long f=(long)salary;//narrowing,explicit
    	 float f1=(float)salary;//narrowing,explicit
    	 System.out.println("Actual Salary:"+salary);
    	 System.out.println("Int salary:"+sal);
    	 System.out.println("long salary:"+f);
    	 System.out.println("float salary:"+f1);
     }  
}
