package packageday8functio;

   public class MethodSyntaxExample{
	   //static global variables
	   static int age;
	   static double salary;{
	   /**
	    * This is a static method with return type as int and no parameter in it
	    * method type:static
	    * Access modifier:public
	    * non-access modifier:static
	    * return type:int
	    * method name:methodSyntaExample
	    * argument:no
	    * return value:no
        */
	  
	  }
   
     public static int test1() { 
    	 System.out.println("I am test1 method.");
    	 //logic
    	 //    int pin=201201;
    	 //    return pin;
    	 return 201201;
     }
   /**
    * This is a static method with return type as void and having no parameter
    * method type:static
    * Access modifier:public
    * non-access modifier:static
    * return type:int
    * method name:test1
    * argument:no
    * return value:201201
    */
   static void test2() {
	   System.out.println("I am test2 method");
	   //return;this will be witten by java compiler at compile
   }
	/**
	 * This is a static method with return type as double and having parameter as boolean
	 * method type:static
	 * Access modifier:default
	 * non-access:static
	 * return type:void
	 * method name:test2
	 * argument:no
	 * return value:no   
	 */
	  static public double test3(boolean b1) {
	        System.out.println("");
	                           double d=15.36;
	                           return d;
	  }
	  /**
	   * This is static private method with return type as void and having parameter as float
	   * method type:static
	   * Access modifier:public
	   * non- access:static
	   * return type:double
	   * method name:test3
	   * argument:boolean
	   * return value 15.36
	   */
	  private void test4(float f) {
		  System.out.println("");
	  }
	  /**
	   * method type:non-static
	   * Access modifier:private
	   * non-access:non-static
	   * return type:void
	   * method name:test4
	   * argument:float
	   * return value:no
	   */
	  static public void main(String[]args) {
	  
	  }  
	  /**
	   * method type:static
	   * Access modifier:public
	   * non-access:static
	   * return type:void
	   * method name:main
	   * argument:no
	   * return value:no
	   */
	  
	  
   }
   
   
   
   
   
   