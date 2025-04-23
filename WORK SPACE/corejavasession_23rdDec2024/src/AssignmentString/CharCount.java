package AssignmentString;
import java.util.HashMap;
import java.util.Map;
public class CharCount {
  public static void getCharCount(String name) {
	  Map<Character,Integer> charmap=new HashMap<Character,Integer>();
	  char strArray[]= name.toCharArray();
	  for (char c: strArray) {
		
			  
		 
		  if (charmap.containsKey(c)) {
			  charmap.put(c,charmap.get(c)+ 1);
		  }else {
			  charmap.put(c,1);
		  }
	  }
	  System.out.println(name + " : "+ charmap);
  }
	public static void main(String[] args) {
		getCharCount("test");
		getCharCount("t");
		getCharCount("tt");
		getCharCount("testing java test");
		getCharCount("t ");
		getCharCount(" ");
		getCharCount("  ");
		getCharCount("sel sel sel");
		
	}

}
