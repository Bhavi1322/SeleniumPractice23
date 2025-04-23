package Assignments;

public class LeftrotateelementsArray {

	public static void main(String[] args) {
		int []arr=new int {10, 20,30,40,50};
		int n=5;
		System.out.println("Original Array:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(" "+arr[i]);
			System.out.println("Array after Rotation fourwards left direction:");
			for(int i=0;i<n;i++) {
				
			}
			int first=arr[0];
			for(int j=0;j<arr.length;i++) {
			arr[j]=arr[j+i];
			arr[j]=first;
			System.out.println(" ");
			for(int i=0;i<arr.length;i++) {
				System.out.println(" "+arr[i]);
			}
				
			}
		}

	}

}
