package packageday15arraysexamples;

import java.util.Arrays;

public class M_Array6 {

	public static void main(String[] args) {
		// declaring a source array
		char[]orgArray= {'a','b','e','c','d'};
		//duplicate array
		char[]cloneArray= {'a','b','c','d','e'};
		System.out.println(Arrays.equals(orgArray,cloneArray));
		Arrays.sort(cloneArray);
		System.out.println(Arrays.equals(orgArray,cloneArray));
		Arrays.sort(cloneArray);
		System.out.println(Arrays.equals(orgArray,cloneArray));
	}

}
