package n1exercici2SamayoaS;

public class TraballadorOnline extends Traballador {
	
	public final double tarifaPlana = 45.50;

	public TraballadorOnline(String nom, String cognom, double preuHora) {
		super(nom, cognom, preuHora);
	}

	public double getTarifaPlana() {
		return tarifaPlana;
	}

	@Override
	public String calcularSou(int numeroHoras) {
		double calculoDos = this.getPreuHora() * numeroHoras;
		double Sou = calculoDos + this.getTarifaPlana();
		return "El salario de " +this.getNom() + " " +this.getCognom() +" este mes por " +numeroHoras +" trabajada es de: " +Sou + "€ incluye Tarifa Plana";
	}

}
