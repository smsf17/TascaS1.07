package n1exercici1SamayoaS;

public abstract class Traballador {
	protected String Nom;
	protected String Cognom;
	protected double PreuHora;
	
	public Traballador(String nom, String cognom, double preuHora) {
		super();
		Nom = nom;
		Cognom = cognom;
		PreuHora = preuHora;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}

	public String getCognom() {
		return Cognom;
	}

	public void setCognom(String cognom) {
		Cognom = cognom;
	}

	public double getPreuHora() {
		return PreuHora;
	}

	public void setPreuHora(double preuHora) {
		PreuHora = preuHora;
	}
	
	public abstract String calcularSou(int numeroHoras);

	@Override
	public String toString() {
		return "Traballador [Nom: " + Nom + ", Cognom: " + Cognom + ", PreuHora: " + PreuHora + "€";
	}

}
