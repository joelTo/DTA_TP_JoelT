package fr.pizzeria.model.menu;

import fr.pizzeria.model.Pizza.Pizza;

public class AjouterUnePizza extends Menu{
	


	public String recupererNomMenu(){
		return "AjouterUnePizza";
	}
	
	public void retournerAffichage(){
		System.out.println("2. Ajouter une nouvelle pizza ");
	}
	
	public void action(Pizza[] tab){
		
	}
}
