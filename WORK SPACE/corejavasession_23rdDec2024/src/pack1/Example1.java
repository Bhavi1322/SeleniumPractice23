package pack1;

public class Example1 {
   private int num1=10;
   int num2=50;
   protected int num3=100;
   public int num4=150;
	public static void main(String[] args) {
		Example1 ref=new Example1();
		System.out.println("Accessing num1 from Example1 class:"+ref.num1);
		System.out.println("Accessing default num2 from Example1 class:"+ref.num2);
	    System.out.println("Accessing protected num3 from Example1 class:"+ref.num3);
	    System.out.println("Accessing public num4 from Example1 class:"+ref.num4);

	}

	}

