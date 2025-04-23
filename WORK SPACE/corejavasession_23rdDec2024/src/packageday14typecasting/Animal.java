package packageday14typecasting;

public class Animal {
            void eat() {
            	    System.out.println("animal Eat");
            }
            class herbivores extends Animal{
            	void eat() {
            		System.out.println("Herbivores Eat plants");
            	}
            }
            class omnivores extends Animal{
            	void walking() {
            		System.out.println("Omnivores Eat plants and meat");
            	}
            }
            class carnivores extends Animal{
            	void walking() {
            		System.out.println("Carnivores walking");
            	}
            }
            public class Runtime{
	public static void main(String[] args) {
		Animal A=new Animal();
		A.eat();//Animal Eat
		Animal h= new herbivores();//runtime poly-inheritance+upcasting+overring
		h.eat();
		Animal o=new omnivores();//runtime poly-inheritance+upcasting+overring
		o.eat();
		Animal c= new carnivores();//not a Runtime poly-inheritance+upcasting+overring
		o.eat();
		
	}
	}

}
