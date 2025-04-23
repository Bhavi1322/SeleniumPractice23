package Assignm;

public class ArmstongNumber3Digits {

	public static void main(String[] args) {
	System.out.println("Enter a3-digit number:");
	int num=999;
	if(num<100||num>999) {
    System.out.println("Please enter a valid 3-digit number.");
	}else {
		int originalNum=num;
		int sum=0;
		while(num!=0) {
		int digit=num%10;
		sum+=digit*digit*digit;
		num/=10;
		}
		if(sum==originalNum) {
			System.out.println(originalNum+"is an Armstrong num.");
		}else {
			System.out.println(originalNum+"is not an Armstrong num.");
		}
	}

	}
}



