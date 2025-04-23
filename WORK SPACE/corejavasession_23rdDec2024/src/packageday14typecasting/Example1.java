package packageday14typecasting;

public class Example1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=25;
		float num2=(float)num1;//explicit-widening
		double num3=num1;//implicit widening
		double num4=25.36;
		float num5=(float)num4;//explicit narrowing
		System.out.println("Program Ends");
	}

}
