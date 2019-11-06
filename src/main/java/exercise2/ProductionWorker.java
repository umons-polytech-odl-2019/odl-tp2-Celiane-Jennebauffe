package exercise2;

public class ProductionWorker implements Payable {
	private int ProducedPieceRate;
	private int nombre=0;

	public ProductionWorker(int ProducedPieceRate) {
		this.ProducedPieceRate=ProducedPieceRate;
	}

	public void produceOnePiece() { nombre++;} //compteur du nombre de pièce produites

	public float computeSalary() {
		return nombre*ProducedPieceRate;
	}
}
