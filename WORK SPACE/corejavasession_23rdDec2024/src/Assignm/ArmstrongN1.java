package Assignm;

public class ArmstrongN1 {

	public static void main(String[] args) {
		int n=135;
		int t1=n;
		int leng=0;
		while(t1!=0) {
			leng=leng+1;
			t1=t1/10;
		}
		 int  t2=n;
		int arm=0;
		while(t2!=0) {
	}
       int mul=1;
       rem=t2%10;
       for(int i=1;i<=leng;i++) {
    	   mul=mul*rem;
       }
       arm=arm+mul;
       t2=t2/10;

	System.out.println("Armstrong is:"+n);
	System.out.println("Armstrong not is: "+n);
		
	}
		
	}
