package exercise1;

	public abstract class Employee {
		private final String name;
		protected float salary;
		private int sales=0;
		private float workedHours=0;
		protected Employee(String name) //on est en protected car accessible que par des classes filles
		{
			this.name=name;
		}

	public float computeSalary() {
		return 0;
	}

	public void workOneHour() { this.workedHours +=1;} //compteur du nombre d'heures travaillées

	public float getWorkedHours()
	{ return workedHours;}


	public void sell() { sales++;} //compteur des ventes effectuées

	public int getSales()
	{
		return sales;
	}
	public float getSalary()
	{
		return salary;
	}
	public String getName()
	{	return name; }
}

