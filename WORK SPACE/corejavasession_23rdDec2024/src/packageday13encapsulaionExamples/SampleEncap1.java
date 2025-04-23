package packageday13encapsulaionExamples;

public class SampleEncap1 {
public void setEmpId(int empId) {
		this.empId = empId;
	}
private int empId=101;
private double salary=45000;
  public int getEmpId() {
	  return empId;
	  
  }
   public double getSalary() {
	   return salary;
   }
   public void setSalary(double Salary) {
	   this.empId=empId;
   }
    public void setSalary(double salary) {
    	this.salary=salary
    }
  public class Example1{
  }
	public static void main(String[] args) {
	SampleEncap ref=new SampleEncap();
	//System.out.println("private empId:"+ref.EmpId);
	//System.out.println("private salary:"+ref.Salary);
	System.out.println("private empId:"+ref.getEmpId());
	System.out.println("private salary:"+ref.getSalary());
	ref.setEmpId(501);
	ref.setSalary(55000);
	System.out.println("updated,private empId:"+ref.getEmpId());
	System.out.println("updated,private salary:"+ref.getSalary());
	SampleEncap ref2=new SampleEncap();
	System.out.println("ref2,private empId:"+ref2.getEmpId());
	System.out.println("ref2private salary:"+ref2.getSalary());
	
	}

}
