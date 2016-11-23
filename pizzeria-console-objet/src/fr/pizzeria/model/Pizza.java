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

}

