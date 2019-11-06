package exercise1;
import exercise2.Exercise2;
import exercise2.Payable; //pour adapter le code de l'ex 1 à l'ex 2

public abstract class Employee implements Payable {  //l'interface n'intervient que pour l'ex 2
		private final String name;
		protected float salary;
		private int sales=0;
		private float workedHours=0;
		protected Employee(String name) //on est en protected car accessible que par des classes filles
		{
			this.name=name;
		}

	public float computeSalary() {return 0;}  //cette ligne peut etre retirée pour l'ex 2 où on utilise l'interface

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

