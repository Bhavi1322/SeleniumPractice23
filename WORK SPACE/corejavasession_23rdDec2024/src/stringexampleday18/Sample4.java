package stringexampleday18;

public class Sample4 {

	public static void main(String[] args) {
		String str="I am staying in pune, 411015";
		int uppercaseCount=0;
		int lowercaseCount=0;
		int numCount=0;
		int symbolcaseCount=0;
		for(int i=0;i<str.length();i++){
			char ch=str.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				//upperCaseCount++;
			}else if(ch>='a' && ch<='z')
			{
				//lowerCaseCount++;
			}else if(ch>='0' && ch<='9')
			{
				numCount++;
			}else {
				//symbolCaseCount++;
			}
		}
		System.out.println("Upper case char count: "+upperCaseCount);
		System.out.println("lower case char count: "+lowerCaseCount);
		System.out.println("num count: "+numCount);
		System.out.println("Symbol count: "+symbolCaseCount);
	}


			
			
		
	}


