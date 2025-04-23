package packageday15arraysexamples;

import java.util.Arrays;

public class M_Array3 {

	public static void main(String[] args) {
		// declaring a source array
		char[] copyFrom= {'d','e','c','a','f','f','e','i','n','a','t','e'};
		System.out.println("Elements count in copyFrom array:"+copyFrom.length);
		//declaring a destination array
		char[]copyTo=Arrays.copyOf(copyFrom, 5);
		System.out.println("Elements count in copyFrom array:"+copyTo.length);
		for(int i=0;i<copyTo.length;i++) {
			System.out.print(copyTo[i]+" ");
		}
		System.out.println("\n**************************After Sorting*******************");
		9Arrays.sort(copyWithRange);//it will sort array elements in ascending order and stored sorted element in the same array
		for(char c:copyWithRange) {
			System.out.print(c+" ");//a,c,e,f,f
		}
	}

}
