package day11testngExample2;

import org.testng.annotations.Test;

public class Example2 {
  @Test
  public void Tc2() {
	  System.out.println("TC2 running");
  }
	  @Test
	  public void TC1() {
		  System.out.println("TC1 running");
	  }
	  
	 
	  public void TC3() {
		  System.out.println("TC3 running");
		  TC1();
	  }
	  
}
	
	 
	  
	
  

