package packageday14typecasting;

public class Exampl2 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		calling(123);
		System.out.println(display(50));
		System.out.println("Program ends");

	}
     static void calling(double d) {//float num=50;//implicit widening
    	 System.out.println("calling number is:"+d);
     }
     static int display(float num) {//
    	 System.out.println("I am displaying"+num);//implicit widening
    	 return(int)num;//explicit narrowing
     }
}
