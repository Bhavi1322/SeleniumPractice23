package packageday12abstractions;

interface Animal12 {
	int age=20;//by default public static final
	public void animalSound();//interface method (does not have a body)
	public void sleep(int i);//interface method (does not have a body)
	}
	// interface
  interface Reptile{
	  public void color();//interface method (does not have a body)
	}
    //Pig "implements" the Animal interface
	  class Pig12 implements Animal12{
		  public void animalSound() {
			  //the body of animalSound()is provided here
			  System.out.println("The Pig says:wee wee");
		  }
		  public void sleep(int k) {
			//the body of sleep()is provided here
			  System.out.println("Zzz");
		  }
		 
		  class Dog12 extends Pig12 implements Reptile{
			  public void animalSound() {
				  //the body of animalSound()is provided here
				  System.out.println("The dog says:bhow bhow");
			  }
			  public void color() {
				  System.out.println("color:blue") ;
			  }
		  }
		  class Interface7{
		public static void main(String[] args) {
			Pig12 P1=new Pig12();//Create a Pig object
			P1.animalSound();
			P1.sleep(25);
			Dog12 d1=new Dog12();
			d1.animalSound();
			d1.sleep(10);
			d1.color();
			System.out.println(Animal0.age);
			//Animal0.age=200;
		}
		  }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
