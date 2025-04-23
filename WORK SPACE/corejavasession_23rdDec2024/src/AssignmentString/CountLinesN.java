package AssignmentString;

public class CountLinesN {
        public static void main(String args[]) {
        	int l=0,w=0,c=0;
        	BufferedReader br=new BufferedReader("INPUT.txt")
        	String currLine=br.readLine();
        	while( currLine!= null) {
        		l++;
        		 String words[]=currLine.split(" ");
        		 w=w+words.length;
        		 
        		 for(String word: words)
        			 c=c+ word.length();
        		 currLine = br.readLine();
        	}
        	System.out.println("No of Lines:"+l);
        	System.out.println("No of words:"+w);
        	System.out.println("No of characters:"+c);
        }
}
