package Assignments;

public class CountOfNumber {

	public static void main(String[] args) {
		String s="hey1234876hey";
		char[] chars=s.toCharArray();
		StringBuilder sb=new StringBuilder();
		for(char c:chars) {
			if(Character.isDigit(c)) {
				sb.append(c);
			}
		}
         System.out.println(sb);
         
	}

}
