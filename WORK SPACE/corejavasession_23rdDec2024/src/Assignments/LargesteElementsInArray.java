package Assignments;

public class LargesteElementsInArray {

	public static void main(String[] args) {
		int arr[]=new int[] {85,44,12,405,66};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				  max=arr[i];
			}
		}
        System.out.println("Largest element in an array"+maxs);
	}

}
