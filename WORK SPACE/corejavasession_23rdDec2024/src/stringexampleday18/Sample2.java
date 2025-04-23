package stringexampleday18;

public class Sample2 {

	public static void main(String[] args) {
		String s1="Banglore is IT hub,pune is also known for IT and Nature";
		String[]strArray1=s1.split("");
		for(String str1:strArray1) {
			System.out.println(str1);
			System.out.println("*************************************************************");
			String[]strArray2=s1.split(" ",3);
			for(String str2:strArray2) {
			System.out.println(str1);
			System.out.println("********************************************");
			String s2="         welcome to java programing               ";
			System.out.println("s2 length:"+s2.length());
			System.out.println("s2"+s2);
			System.out.println("s2 length without space in pre/post:"+s2.trim().length());
			System.out.println("s2:"+s2.trim());
			System.out.println("*************************************************");
			String s3="I am staying In pune";
			System.out.println("s3"+s3);
			System.out.println("s3 in lowercase:"+s3.toLowerCase());
			System.out.println("s3 in uppercase:"+s3.toUpperCase());
			}
			
		}

	}

}
