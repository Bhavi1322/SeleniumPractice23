package AssignmentString;
import java.util.Arrays;
public class AnagramNot {

	public static void main(String[] args) {
		String str1="mahi",str2="sahi";
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()!=str2.length()) {
			System.out.println("Strings are Not Anagram");
			
		}
		else {
			char[]String1=str1.toCharArray();
			char[]String2=str2.toCharArray();
			Arrays.sort(String1);
			Arrays.sort(String2);
			if(Arrays.equals(String1,String2)==true){
				System.out.println("String are Anagram");
			}
			else {
				System.out.println("String are Not Anagram");
			}
		}
	}

}
