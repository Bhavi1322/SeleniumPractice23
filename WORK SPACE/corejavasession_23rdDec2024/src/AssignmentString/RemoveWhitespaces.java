package AssignmentString;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		String newString = "             mumbai to pune         ";
	//	System.out.println(newString.trim());
		System.out.println(newString.replaceAll("//s+",""));
		//String remString=StringUtils.deleteWhitespace(newString);
		//System.out.println(remString);
	}

}
