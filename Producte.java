/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Objects;

public abstract class Producte {
	private float preu;
	private String nom;

	public Producte(String nom, float preu) {
		this.preu = preu;
		this.nom = nom;
	}

	public float getPreu() {
		return preu;
	}

	public void setPreu(float preu) {
		this.preu = preu;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public abstract float calcularPreu(float quantitat);

	@Override
	public String toString() {
		return "Producte Nom: " + this.nom + ", Preu: " + this.preu + "€. ";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nom, preu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		Producte other = (Producte) obj;
		return Objects.equals(nom, other.nom);
	}
	
	

}