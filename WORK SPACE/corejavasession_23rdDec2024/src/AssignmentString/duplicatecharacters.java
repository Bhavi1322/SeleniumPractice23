package AssignmentString;

public class duplicatecharacters {

	public static void main(String[] args) {
		String str = "Bhavika samadhan patil";
		char[] ch = str.toCharArray();
	//	int toString;
		int count;
		for(int i=0;i<ch.length;i++) {
			count = 0;
			if(ch[i]=='0') 
				continue;
			for(int j =i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]&& count ==0) {
					System.out.print(ch[i]+" ");
					ch[j]='0';
					count++;
				}
			}
		}
		System.out.println("\nString1 :"+str);
		System.out.println("String2 :"+ch.toString());
		System.out.println("String2 :"+String.valueOf(ch));
	//	System.out.println("String2 :"+toString+"has tatal char count as "+toString.(ch));
	}

}
