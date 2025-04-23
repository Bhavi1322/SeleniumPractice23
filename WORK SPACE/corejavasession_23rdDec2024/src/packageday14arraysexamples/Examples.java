package packageday14arraysexamples;

public class Examples {
               int age;
               double salary;
               Examples(){
            	   System.out.println("Zero-param");
               }
               Examples(int a){
            	   age=a;
            	   System.out.println("int-param");
               }
               Examples(double a){
            	   salary=a;
            	   System.out.println("double-param");
               }void calling(){
            	   System.out.println("calling of Example1 class,age:"+age);
            	   System.out.println("calling of Example1 class,salary:"+salary);
               }
             
         public class Array7{      
	public static void main(String[] args) {
		System.out.println("***********************************");
		Examples e2=new Examples();
		Examples e3=new Examples(15);
        Examples e4=new Examples(25.36);
        e2.calling();
        e3.calling();
        e4.calling();
        System.out.println("***********************************");
       // Examples[]e=new Examples[] {//new Examples(),new Examples(15),new Examples(25.36)};
        		   //or
        	//	 Examples[]e= {new Examples(),new Examples(15),new Examples(25.36)};
              		   //or
        		Examples[] e=new Examples[3];
        		e[0]=new Examples();          //e[0]=e2;
        		e[0]=new Examples(15);         //e[1]=e3;
        		e[0]=new Examples(25.36);       //e[2]=4;
        		 
        		e[0].calling();//e2.calling();
        		e[1].calling();//e3.calling();
        		e[0].calling();//e4.calling();
        }       
	}
         }

