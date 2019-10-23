package exercise1;

public class FixedSalaryEmployee extends Employee {
	private int salary=0;

      public FixedSalaryEmployee(String name, int fixedSalary) { //constructeur
		  super(name); //utilise le constructeur
		  this.salary=fixedSalary;
	  }
	  public void workOneHour{
      	super.WorkOneHour();
	}
	@Override
	public int ComputeSalary()
	{
		return this.salary;
	}


}
