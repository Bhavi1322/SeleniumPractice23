package packageday15arraysexamples;

public class Example2 {

	public static void main(String[] args) {
		//10,20,30,40,50
		//int a=10,b=20,c=30,d=40,e=50;
		int[]num= {100,200,300,400,500};
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
	//	System.out.println(num[5]);//runtime errar-array index out of bond
		System.out.println("total array element count:"+num.length);
		    num[0]=10;
		    num[0]=110;
		    num[0]=105;
		    num[0]=310;
		    num[0]=103;
		    System.out.println("******Printing array element one by one using simple for loop****");
		    for(int i=0;i<num.length;i++) {
		      System.out.println(num[i]);
	}
		    System.out.println("******Printing array element one by one using simple for -each loop****");
		    /*
		     * for(LHS:RHS)
		     * {
		     * }
		     * where:      
		     *              LHStype should be same as RHS type(arryname)
		     */
              for(int x:num) {
            	  System.out.println(x);
              }
}
}