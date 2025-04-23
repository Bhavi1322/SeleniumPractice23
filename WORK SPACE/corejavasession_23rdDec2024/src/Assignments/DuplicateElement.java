package Assignments;

public class DuplicateElement {

	public static void main(String[] args) {
	int[] arr=new int[] {1,2,3,4,5,2,7,8,9,9,4};
	System.out.println("Duplicat elements in given array");
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				System.out.println(arr[j]);
			}
		}
	}
	}

}
