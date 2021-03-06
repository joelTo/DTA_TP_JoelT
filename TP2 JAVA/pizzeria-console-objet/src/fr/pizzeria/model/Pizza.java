package fr.pizzeria.model;


public class Pizza {

	public Integer id;
	public String code;
	public String nom;
	public Double prix;
	
	public static Integer nbPizzas;


	public Pizza(Integer id, String code, String nom, Double prix){
		this.id=id;
		this.code=code; 
		this.nom=nom;
		this.prix=prix;
		nbPizzas++;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public Double getPrix() {
		return prix;
	}


	public void setPrix(Double prix) {
		this.prix = prix;
	}


	public static Integer getNbPizzas() {
		return nbPizzas;
	}


	public static void setNbPizzas(Integer nbPizzas) {
		Pizza.nbPizzas = nbPizzas;
	}	

}

