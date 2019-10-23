package exercise1;

public class Exercise1 {
	public Employee buildFixedSalaryEmployee(String name, int fixedSalary) {
		return new FixedSalaryEmployee(name, fixedSalary);
	}

	public Employee buildBaseSalaryPlusCommissionEmployee(String name, int baseSalary, int commission) {

		return new WorkHourSalaryEmployee(name, hourRate);
	}

	public Employee buildWorkHourSalaryEmployee(String name, int hourlyRoute) {
		return BaseSalaryPlusCommissionEmploye(name, baseSalary, commission);
	}
}
