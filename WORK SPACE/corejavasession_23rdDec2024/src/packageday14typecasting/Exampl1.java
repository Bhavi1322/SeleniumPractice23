package packageday14typecasting;

public class Exampl1 {

	public static void main(String[] args) {
		System.out.println("Program Starts");
		int num1=25;
		float num2=(float)num1;//explicit-widening
		double num3=num1;//implicit widening-->java compiler wii be double num3=(double)num1;
		double num4=25.36;
		float num5=(float)num4;//explicit narrowing
		System.out.println("Program ends");
		

	}

}
