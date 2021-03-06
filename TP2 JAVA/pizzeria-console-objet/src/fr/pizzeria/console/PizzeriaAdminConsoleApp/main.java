package fr.pizzeria.console.PizzeriaAdminConsoleApp;

import java.util.Scanner;

import fr.pizzeria.model.*;
public class main {
	public static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pizza[] pizza={new Pizza(0,"PEP","P�p�roni",12.50),
				new Pizza(1,"MAR","P�p�roni",14.00),
				new Pizza(2,"REI","La Reine",11.00),
				new Pizza(3,"FRO","La 4 fromages",12.00),
				new Pizza(4,"CAN","La cannibale",12.50),
				new Pizza(5,"SAV","La savoyarde",13.00),
				new Pizza(6,"ORI","L'orientale",13.50),
				new Pizza(7,"IND","L'indienne",14.00)
		};


		// Variable de sortie de la boucle d'affichage du menu
		Boolean Arret = false;
		
		
		do {
			System.out.println();
		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza ");
		System.out.println("3. Mettre � jour une pizza");
		System.out.println("4. Supprimer une pizza");
		System.out.println("99. Sortir");
		System.out.println("***** ------------------------*****");
		
		
		int saisi1 = sc.nextInt();
		Arret = (saisi1==99)? true:false; 
		
		switch (saisi1) {
			case 1 :
				affichagePizza(pizza);
				break;
			case 2 :
				pizza=ajouterUnePizza(pizza);
				break;
			case 3 :
				pizza=miseAJour(pizza);
				break;
			case 4 :
				pizza=supprimerUnePizza(pizza);
				break;
			case 99:
				Arret = true;
					} 
		}while(Arret == false);
		sc.close();
	}


	public static void affichagePizza( Pizza[] tabPizza){
		int taille= tabPizza.length;

		// Utilisation d'une boucle <for()> afin d'�viter et s'adapter au nombre de ligne
		for(int i=0;i<taille;i++){
			System.out.println(tabPizza[i].code + " -> " + tabPizza[i].nom +" ("+ tabPizza[i].prix +" �)" );
		}
		System.out.println("***** ------------------------*****");
		return;
	}

	public static  Pizza[] ajouterUnePizza(Pizza[] tabPizza){
		int taille= tabPizza.length;

		Pizza[] tabPizza2 = new Pizza[taille+1];


		for(int i=0;i<taille;i++){

			tabPizza2[i]=tabPizza[i];

		}

		System.out.println("Veuillez entrer Alias de votre tabPizza");
		String saisieAlias = sc.next();

		System.out.println("Veuillez entrer le nom de votre tabPizza");
		String saisieNom = sc.next();

		System.out.println("Veuillez entrer le prix de votre tabPizza");
		Double saisiePrix = sc.nextDouble();

		Pizza pizzaAjoutee= new Pizza(taille,saisieAlias,saisieNom,saisiePrix);

		tabPizza2[taille]=pizzaAjoutee;
		return tabPizza2;
	}


	public static Pizza[] miseAJour(Pizza[] tabPizza){
		affichagePlusPlus(tabPizza);

		System.out.println("Quelle pizza voulez-vous modifier ? ");
		int numPizzaModiffier = sc.nextInt();

		System.out.println("Veuillez entrer la modification de l'Alias de votre tabPizza");
		String saisieAlias = sc.next();

		System.out.println("Veuillez entrer la modification  du nom de votre tabPizza");
		String saisieNom = sc.next();

		System.out.println("Veuillez entrer la modification  du prix de votre tabPizza");
		Double saisiePrix = sc.nextDouble();

		Pizza pizzaModifiee= new Pizza(numPizzaModiffier,saisieAlias,saisieNom,saisiePrix);
		tabPizza[numPizzaModiffier]=pizzaModifiee;
		System.out.println("***** ------------------------*****");

		return tabPizza;
	}

	public static Pizza[] supprimerUnePizza(Pizza[] pizza){
		affichagePlusPlus(pizza);
		System.out.println("Quelle pizza voulez-vous supprimer ? ");
		int nbPizzaSupprimer = sc.nextInt();

		int taille= pizza.length;
		Pizza[] pizza2 = new Pizza[taille-1];

		int u =0;
		for(int i=0;i<taille;i++){
			if(nbPizzaSupprimer==i){
				continue;
			}
			pizza2[u]=pizza[i];
			u++;

		}
		return pizza2;
	}

	public static void affichagePlusPlus(Pizza[] tabPizza){
		 int taille= tabPizza.length;

		 for(int i=0;i<taille;i++){
			 System.out.println(tabPizza[i].id +") "+tabPizza[i].code + " -> " + tabPizza[i].nom +" ("+ tabPizza[i].prix +" �)" );
		 }
		 
	}
}
