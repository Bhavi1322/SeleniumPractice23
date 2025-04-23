package Assignments;

public class ExchhangeName {

	public static void main(String[] args) {
		String s1="Name";//after swap s1=james
		String s2="James";//after swap s2=James
        String s=s1+s2;//james0James
        System.out.println("Before swapping:"+s1+" "+s2);
        s2=s.substring(0, s.length()-s2.length());
        s1=s.substring(s2.length());
        System.out.println("After swapping:"+s1+" "+s2);
	}

}
