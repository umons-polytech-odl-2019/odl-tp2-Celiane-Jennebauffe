package exercise1;

public class FixedSalaryEmployee extends Employee {

      public FixedSalaryEmployee(String name, int fixedSalary) { //constructeur
		  super(name); //utilise le constructeur
		  this.salary=fixedSalary;
	  }
	  public void workOneHour{
      	super.WorkOneHour();
	}
	@Override
	public float ComputeSalary()
	{
		return this.salary;
	}


}
