import java.util.Scanner;

public class main {
	public static Scanner sc = new Scanner (System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String[][] pizza ={{"0","PEP","P�p�roni","12,50"},
				   {"1","MAR","Margherita","14,00"},
				   {"2","REI","La Reine", "11,00"},
				   {"3","FRO","Le 4 fromages","12,00"},
				   {"4","CAN","La cannibale","12,50"},
				   {"5","SAV","La savoyarde", "13,00"},
				   {"6","ORI","L'orientale", "13,50"},
				   {"7","IND","L'indenne","14,00"}};
		
		
		pizza=supprimerUnePizza(pizza);
		//miseAJour(pizza);
		
		
		affichage_Pizza(pizza);

	}
	
	
	
	
	
	public static void affichage_Pizza(String[][] pizza){
		 int taille= pizza.length;

		 for(int i=0;i<taille;i++){
			 System.out.println(pizza[i][1] + " -> " + pizza[i][2] +" ("+ pizza[i][3] +" �)" );
		 }
	}
	
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
		 
		
		 String saisi = sc.nextLine();
		 pizza2[taille][1]=saisi;
		 
		 System.out.println("Veuillez entrer le nom de votre pizza");
		 String saisi2 = sc.nextLine();
		 pizza2[taille][2]=saisi2;
		 
		 System.out.println("Veuillez entrer le prix de votre pizza");
		 String saisi3 = sc.nextLine();
		 pizza2[taille][3]=saisi3;
		 
		 return pizza2;
	}
	
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
		 
		 
		return pizza;
	}
	
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
        System.out.println("     ****************    ");
        affichagePlusPlus(pizza2);
        System.out.println("     ****************    ");
		
		return pizza2;
	}
	
	
	
	
	
	public static void affichagePlusPlus(String[][] pizza){
		 int taille= pizza.length;

		 for(int i=0;i<taille;i++){
			 System.out.println(pizza[i][0] +") "+pizza[i][1] + " -> " + pizza[i][2] +" ("+ pizza[i][3] +" �)" );
		 }
		 
	}
}
