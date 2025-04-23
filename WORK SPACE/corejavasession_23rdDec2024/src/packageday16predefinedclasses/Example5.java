package packageday16predefinedclasses;

public class Example5 {

	public static void main(String[] args) {
		System.out.println("Program starts");
		String name=System.getProperty("java.home");
		System.out.println("Java Path:"+name);
		System.out.println("User current working dir"+System.getProperty("user.dir"));
		System.out.println("User HOME dir"+System.getProperty("user.home"));
		System.out.println("OS name:"+System.getProperty("os.name"));
		System.out.println("Time in millis:"+System.currentTimeMillis());
		System.out.println("Time in nano:"+System.nanoTime());
		System.out.println("user.home");
		System.out.println("User HOME dir:"+System.getProperty("user.home"));
		System.setProperty("user.home","F:\\myplace"); 
		System.out.println("User HOME dir:"+System.getProperty("user.home"));
		System.out.println("Program ends");
				
		

	}

}
