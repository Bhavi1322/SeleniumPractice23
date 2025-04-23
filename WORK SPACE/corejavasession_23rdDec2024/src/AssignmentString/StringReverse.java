package AssignmentString;

public class StringReverse {

	public static void main(String[] args) {
		String str ="Good Morning";
		StringBuffer sb =new StringBuffer("Good Morning");
		//sb.append(str);
		sb.reverse();
		System.out.println(sb);
	}

}
