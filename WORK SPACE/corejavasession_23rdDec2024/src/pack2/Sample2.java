package pack2;

public class Sample2 {

	public static void main(String[] args) {
		// using fully qualified class name accessible public member 
		pack1.Example1 ref=new pack1.Example1();
		System.out.println("Accessing public num4 from Example1 class from sample2:"+ref.num4);
		pack1.Example1 ref2=new pack1.Example1();
		System.out.println("Accessing public num4 of Example1 class from Sample2:"+ref.num4);
		pack1.Example1 ref3=new pack1.Example1();
		System.out.println("Accessing public num4 of Example1 class from sample2:"+ref2.num4);

	}

}
