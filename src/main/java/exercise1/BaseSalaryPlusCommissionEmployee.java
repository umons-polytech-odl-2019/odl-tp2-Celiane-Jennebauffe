package exercise1;

public class BaseSalaryPlusCommissionEmployee extends Employee {
	private float commission;

	public BaseSalaryPlusCommissionEmployee(String name, float baseSalary, float commission) {
		super(name);
		this.salary=baseSalary;
		this.commission=commission;

	}

	@Override
	public float computeSalary() {return (float) this.salary+getSales()*this.commission;	}

}
