package pack2;


public class AccessDefaultMembers2 {

	public static void main(String[] args) {
		DefaultMembers p1=new 87DefaultMembers();
		System.out.println("Accessing default members from another class within same package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
	}

}
