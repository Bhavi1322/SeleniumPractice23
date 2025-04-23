package packageday16predefinedclasse;
 import java.util.Scanner;
public class Demo3 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		char grade;
		double salary;
		String name;
		boolean status;
		Scanner scn=new Scanner(System.in);
		System.out.println("please enter your name: ");
		name=scn.next();
		System.out.println("please enter your Grade: ");
		grade=scn.next().charAt(0);
		System.out.println("please enter your salary: ");
		salary=scn.nextDouble();
		System.out.println("please enter your status: ");
		status=scn.nextBoolean();
		System.out.println("********************************** ");
		System.out.println(name+"\n"+salary+"\n"+grade+"\n"+status);
		System.out.println("Program ends ");
		
	}

}
