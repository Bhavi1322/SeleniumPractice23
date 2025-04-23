

public class Assignment2PrimeNot {
	public static boolean isPrime(int number) {
		//check for number less than2
		if(number<=1) {
			return false;
		}
		//check divisibility from 2 to the sguare root the number for(int i=2; i<=math.sqrt(number);i++{
		if(number%i==0) {
			return false;//If divisible,it's not prime
			return true;  
			//If no divisible,it's not prime
		    return true;}
		    //If no divisors are found,it's prime
		}

	public static void main(String[] args) {
	      int number=29;//testnumber if (isPrime(number)){S
	      System.out.println(number+"is prime(number)");
		System.out.println(number+"is not a prime(number");
	

	}

}
