package pack2;
//import pack1.PrivateMembers;
public class AccessPrivateMembers {
public static void main(String[] args) {
	PrivateMembers p1=new PrivateMembers();
	System.out.println(p1.accNum);
	p1.displayAccNum();
}
}
