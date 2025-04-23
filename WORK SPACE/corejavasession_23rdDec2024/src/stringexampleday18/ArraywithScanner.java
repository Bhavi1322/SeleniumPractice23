package stringexampleday18;
 import java.util.Scanner;
public class ArraywithScanner {

	public static void main(String[] args) {
		int age[]=new int[5];
		Scanner scn=new Scanner(System.in);
       for(int i=0;i<age.length;i++) {
          System.out.println("Enter index "+i+"element"); 
            age[i]=scn.nextInt();}
 	    for(int num:age) {

 	      
 	         System.out.println(num) ;
 		
 	}
 
       }
	}


