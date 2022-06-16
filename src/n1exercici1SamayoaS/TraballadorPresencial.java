package n1exercici1SamayoaS;

public class TraballadorPresencial extends Traballador {
	public static double benzina;

	public TraballadorPresencial(String nom, String cognom, double preuHora, double benzina) {
		super(nom, cognom, preuHora);
		this.benzina = benzina;
	}

	public double getBenzina() {
		return benzina;
	}

	public void setBenzina(double benzina) {
		this.benzina = benzina;
	}

	@Override
	public String calcularSou(int numeroHoras) {
		double calculoUno = this.getPreuHora()* numeroHoras;
		double Sou = calculoUno + this.getBenzina();
		return "El salario de " +this.getNom() + " " +this.getCognom() +" este mes por " +numeroHoras +" trabajada es de: " +Sou + "€.  Incluye Benzina";
	}

}
