package packageday14typecasting;

public class Shapes {
             public void area() {
            	 System.out.println("Find area");
             }
             public void area(int r) {
            	 System.out.println("Circle area="+3.14*r*r);
             }
             public void area(double b,double h) {
            	 System.out.println("Triangle area="+0.5*b*h);
             }
             public void area(int l,int b) {
            	 System.out.println("rectangle area="+l*b);
             }
	public static void main(String[] args) {
		Shapes myShape=new Shapes();//create a Shapes object
		myShape.area();
		myShape.area(5);
		myShape.area(6.0,1.2);
		myShape.area(6,2);

	}

}
