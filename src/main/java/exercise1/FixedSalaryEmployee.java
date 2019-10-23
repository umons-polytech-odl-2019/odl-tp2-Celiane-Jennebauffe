package exercise1;

public class FixedSalaryEmployee extends Employee {

      public FixedSalaryEmployee(String name, int fixedSalary) { //constructeur
		  super(name); //utilise le constructeur de Employee
		  this.salary=fixedSalary;
	  }

	@Override
	public float ComputeSalary()
	{
		return this.salary;
	}

}
