package AssignmentString;

public class ReverseEachWords {

	public static void main(String[] args) {
		String str="java TpecnoC of the Day";
		String[]words = str.split(" ");
		String revString = "";
		for(int i=0;i< words.length;i++) {
			String word=words[i];
			String revword ="";
			for(int j=word.length()-1;j>=0;j--) {
				revword=revword+word.charAt(j);
			}
			revString=revString+revword +" ";
		}
		
          System.out.println(revString);
	}

}
