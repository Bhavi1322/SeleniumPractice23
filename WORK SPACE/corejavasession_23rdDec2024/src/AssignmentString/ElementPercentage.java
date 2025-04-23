package AssignmentString;

public class ElementPercentage {
	public static void getcharPercentage(String str) {
      int len = str.length();
      int upperCaseCount =0;
      int lowerCaseCount =0;
      int digits = 0;
      int  specChars= 0;
      
      for(int i=0;i<len;i++) {
    	  char ch=str.charAt(i);
    	  if(Character.isUpperCase(ch)) {
    		  upperCaseCount++;
    	  }
    	  if(Character.isLowerCase(ch)) {
    		  lowerCaseCount++;
    	  }
    	  if(Character.isDigit(ch)) {
    		  digits++;
    	  }
    	  
    	  else {
    		  specChars++;
    	  }
    	 double upperCasePercentage = (upperCaseCount * 100.0)/len;
    	 double lowerCasePercentage = (lowerCaseCount * 100.0)/len;
    	 double digitsPercentage = (digits * 100.0)/len;
    	 double specCasePercentage = (specChars * 100.0)/len;
    	 System.out.println("In the given String:"+str);
    	// Decimalformat=new DecimalFormat("##.##");
    	 System.out.println("upper case %---->"+upperCasePercentage);
    	 System.out.println("lower case %---->"+lowerCasePercentage);
    	 System.out.println("digits %---->"+digitsPercentage);
    	// System.out.println("special char%---->"+SpecCharsPercentage);
    	 
    	  }
      
      
      }
	public static void main(String[] args) {
		getcharPercentage("Bhavika");

	}

}
