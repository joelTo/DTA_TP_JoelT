package fr.pizzeria.model.menu;




// Importation de librairie de liste
import java.util.List;
import fr.pizzeria.model.menu.AfficherLesPizzas;
import fr.pizzeria.model.menu.AjouterUnePizza;
import fr.pizzeria.model.Pizza.Pizza;

public  class Menu {
	private String[] menu={"Afficher les pizzas", "Ajouter les pizzas"};
	
	public void afficherLeMenu(){
		int taille=menu.length;
		for(int i=0;i<taille;i++){
			System.out.println(i+") "+menu[i]);
		}
	}
	
	public void choix(int a){
		
	}
	public  void retournerAffichage(){
		
	}
	
	public  void action(Pizza[] tab){
		
	}
		
}

