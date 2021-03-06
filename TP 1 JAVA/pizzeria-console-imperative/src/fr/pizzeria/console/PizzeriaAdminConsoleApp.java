package fr.pizzeria.console;

import java.util.Scanner;

/**
 * Class : PizzeriaAdminConsoleApp
 * Permet la création d'une application console sur des données de pizza, pour faire du CRUD
 * 1. Lister les pizzas
 * 2. Ajouter une nouvelle pizza
 * 3. Mettre à jour une pizza
 * 4. Supprimer une pizza
 * @author ETY2
 *
 */

public class PizzeriaAdminConsoleApp {
	public static Scanner sc = new Scanner (System.in);
	
	// Début du main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creation de la liste des pizzas
		String[][] pizza ={{"0","PEP","Pépéroni","12,50"},
						   {"1","MAR","Margherita","14,00"},
		 				   {"2","REI","La Reine", "11,00"},
		 				   {"3","FRO","Le 4 fromages","12,00"},
		 				   {"4","CAN","La cannibale","12,50"},
		 				   {"5","SAV","La savoyarde", "13,00"},
		 				   {"6","ORI","L'orientale", "13,50"},
		 				   {"7","IND","L'indenne","14,00"}};
		
		
		// Variable de sortie de la boucle d'affichage du menu
		Boolean Arret = false;
		
		
		do {
			System.out.println();
		System.out.println("***** Pizzeria Administration *****");
		System.out.println("1. Lister les pizzas");
		System.out.println("2. Ajouter une nouvelle pizza ");
		System.out.println("3. Mettre à jour une pizza");
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
	
	// Fin du main
	
	
	/** 
	 * Pour afficher la liste des pizzas
	 * sous la forme suivant:
	 * <Alias_Pizza> -> <Nom_Pizza> (Prix_Pizza)
	 * 
	 * Exemple:
	 * PEP -> Pépéroni (12.50 €)
	 * 
	 * @param Un tableau double String[][]
	 * @return Rien (Affichage écran)
	 */
	public static void affichagePizza(String[][] pizza){
		 int taille= pizza.length;
		 
		 // Utilisation d'une boucle <for()> afin d'éviter et s'adapter au nombre de ligne
		 for(int i=0;i<taille;i++){
			 System.out.println(pizza[i][1] + " -> " + pizza[i][2] +" ("+ pizza[i][3] +" €)" );
		 }
		 System.out.println("***** ------------------------*****");
	}
	
	/**
	 * Pour ajouter une pizza 
	 * @param Un tableau double String[][]
	 * @return Un tableau double String[][]
	 */
	public static String[][] ajouterUnePizza(String[][] pizza){
		 int taille= pizza.length;
		 
		 String[][] pizza2 = new String[taille+1][4];
		 

		 for(int i=0;i<taille;i++){
			 pizza2[i][0]=pizza[i][0];
			 pizza2[i][1]=pizza[i][1];
			 pizza2[i][2]=pizza[i][2];
			 pizza2[i][3]=pizza[i][3];
		 }
		 
		 pizza2[taille][0]=String.valueOf(taille);
		 System.out.println("Veuillez entrer Alias de votre pizza");
		 String saisi = sc.next();
		 pizza2[taille][1]=saisi;
		 
		 System.out.println("Veuillez entrer le nom de votre pizza");
		 String saisi2 = sc.next();
		 pizza2[taille][2]=saisi2;
		 
		 System.out.println("Veuillez entrer le prix de votre pizza");
		 String saisi3 = sc.next();
		 pizza2[taille][3]=saisi3;
		 
		 System.out.println("***** ------------------------*****");
		 
		 return pizza2;
	}
	
	/**
	 * Pour faire la mise à jour d'un élément de la liste des pizzas
	 * @param Un tableau double String[][]
	 * @return Un tableau double String[][]
	 */
	public static String[][] miseAJour(String[][] pizza){
		affichagePlusPlus(pizza);
		 
		 System.out.println("Quelle pizza voulez-vous modifier ? ");
		 int nbPizzaModiffier = sc.nextInt();
		 
		 System.out.println("Veuillez entrer le nouvel Alias de votre pizza");	
		 String saisi4 = sc.next();
		 pizza[nbPizzaModiffier][1]=saisi4;
		 
		 System.out.println("Veuillez entrer le nouvel nom de votre pizza");
		 String saisi2 = sc.next();
		 pizza[nbPizzaModiffier][2]=saisi2;
		 
		 System.out.println("Veuillez entrer le nouvel prix de votre pizza");
		 String saisi3 = sc.next();
		 pizza[nbPizzaModiffier][3]=saisi3;
		 
		 System.out.println("***** ------------------------*****");
		 
		return pizza;
	}
	
	/**
	 * Pour supprimer une pizza 
	 * @param Un tableau double String[][]
	 * @return Un tableau double String[][]
	 */
	public static String[][] supprimerUnePizza(String[][] pizza){
		affichagePlusPlus(pizza);
		System.out.println("Quelle pizza voulez-vous supprimer ? ");
		int nbPizzaSupprimer = sc.nextInt();
		
		int taille= pizza.length;
       String[][] pizza2 = new String[taille-1][4];
       
		int u =0;
       for(int i=0;i<taille;i++){
       		if(nbPizzaSupprimer==i){
       			continue;
       		}
			 pizza2[u][0]=pizza[i][0];
			 pizza2[u][1]=pizza[i][1];
			 pizza2[u][2]=pizza[i][2];
			 pizza2[u][3]=pizza[i][3];
			 u++;
			 
		 }
		
       System.out.println("***** ------------------------*****");
       return pizza2;
	}
	
	
	/**
	 * Pour un affichage ++
	 * sous la forme :
	 * <N°> ) <Alias_Pizza> -> <Nom_Pizza> (Prix_Pizza)
	 * 
	 * Exemple:
	 * 0) PEP -> Pépéroni (12,50 €)
	 * @param Un tableau double String[][]
	 */
	public static void affichagePlusPlus(String[][] pizza){
		 int taille= pizza.length;

		 for(int i=0;i<taille;i++){
			 System.out.println(pizza[i][0] +") "+pizza[i][1] + " -> " + pizza[i][2] +" ("+ pizza[i][3] +" �)" );
		 }
		 
	}
}

