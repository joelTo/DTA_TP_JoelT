package fr.pizzeria.model.menu;

import fr.pizzeria.model.Pizza.Pizza;

public class AfficherLesPizzas extends Menu{

	public String recupererNomMenu(){
		return "AfficherLesPizzas";
	}

	public void retournerAffichage(){
		System.out.println("1. Lister les pizzas");
	}

	public void action(Pizza[] tabPizza){
		int taille= tabPizza.length;

		// Utilisation d'une boucle <for()> afin d'éviter et s'adapter au nombre de ligne
		for(int i=0;i<taille;i++){
			System.out.println(tabPizza[i].getCode() + " -> " + tabPizza[i].getNom() +" ("+ tabPizza[i].getPrix() +" €)" );
		}
		System.out.println("***** ------------------------*****");
		return;
	}

}
