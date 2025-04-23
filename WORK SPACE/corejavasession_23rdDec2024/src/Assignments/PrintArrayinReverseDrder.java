package Assignments;

public class PrintArrayinReverseDrder {

	public static void main(String[] args) {
		int a[]=new int[] {1,2,3,4,5};
		System.out.println("Original Array:");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
				System.out.println();
			System.out.println("array in reverse order:");
			for(int i=a.length-1;i>=0;i--) {//5 4 3 2 1
				System.out.print(a[i]+" ");
			}
		}
	}


