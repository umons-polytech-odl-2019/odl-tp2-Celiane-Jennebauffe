package exercise1;

	public abstract class Employee {
		private final String name;
		private float salary;
		private int sales=0;
		protected Employee(String name) //on est en protected car accessible que par des classes filles
		{
			this.name=name;

		}

	public int computeSalary() {
		return 0;
	}

	public void sell() { sales++;}

	public void workOneHour() { this.workedHours +=1;}

	public String getName() {
		return name;
	}
}
//getsales get woredhours
