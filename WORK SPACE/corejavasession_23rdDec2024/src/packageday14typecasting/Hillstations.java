package packageday14typecasting;

public class Hillstations {
     void location() {
    	 System.out.println("Location is:");
     }
     void famousfor() {
    	 System.out.println("Famous for:");
     }
     }
class Manali extends Hillstations{
	void location() {
		System.out.println("Manali is in Himachal pradesh");
	}
	void famousfor() {
		System.out.println("It is Famous for hadimba temple and adventure sports");
	}
	}
    class Mussorie extends Hillstations{
    	void location() {
    		System.out.println("Mussoori is in Uttarakhand");
    	}
    	void famousfor() {
    		System.out.println("It is Famous for education institutions");
    	}
    	class Gulmarg extends Hillstations{
    		void location() {
    			System.out.println("Gulmarg is in j&k");
    		}
    		void famousfor() {
    		System.out.println("It is Famous for sking");
    	}
    		public class Runtime2{
	public static void main(String[] args) {
		Hillstations A=new Hillstations();
		A.location();
		A.famousfor();
		System.out.println("**********************************");
		Hillstations M= new Manali();
		M.location();
		M.famousfor();
		System.out.println("*************************************");
		Hillstations Mu=new Mussoorie() ;
		Mu.location();
		Mu.famousfor();
		System.out.println("*****************************");
		Hillstations G=new Gulmarg();
		G.location();
		G.famousfor();

	}
    		
    		}
    	}
    }
