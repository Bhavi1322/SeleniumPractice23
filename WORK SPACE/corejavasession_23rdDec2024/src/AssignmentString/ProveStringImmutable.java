package AssignmentString;

public class ProveStringImmutable {

	public static void main(String[] args) {
		  String s1 = "Bhavika";
		  String s2 = "Bhavika";
		  s1 +="GAIN";
		  
		  if(s1 == s2) {
			System.out.println("Both are pointing to same object")  ;
		  }else {
			  System.out.println("Both are pointing to different object")  ;  
		  }
		  String str = new String("Bhavika");
		  System.out.println(str);
		  str.concat("GAIN");
		  System.out.println(str);
		  
	}

}
