package exercise1;

public class WorkHourSalaryEmployee extends Employee {
	private float hourRate;

	public WorkHourSalaryEmployee(String name, float hourRate)
	{
		super(name); //utilise le constructeur de la classe mère
		this.hourRate=hourRate;
		this.workedHours=160;

	}

	@Override
	public float computeSalary() {
		return (float) this.hourRate*this.workedHours;
	}
}
