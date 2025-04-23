package packageday16predefinedclasse;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println("Program start");
		int num1,num2,res;
		//using Scanner class we can take input at runtime
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 1st number: ");
		num1=scn.nextInt();
		System.out.println("Enter 2nd number: ");
		num2=scn.nextInt();
		res=num1+num2;
		System.out.println("number1:"+num1);
		System.out.println("number2:"+num2);
		System.out.println("Result:"+res);
		System.out.println("Program ends");
	}

}
