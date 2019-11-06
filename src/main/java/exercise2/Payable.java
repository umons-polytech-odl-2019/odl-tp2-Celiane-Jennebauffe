package exercise2;

public interface Payable {
	default public float computeSalary() { return -1;};
}
