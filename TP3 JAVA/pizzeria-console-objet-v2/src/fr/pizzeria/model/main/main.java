package fr.pizzeria.model.main;

import java.util.Scanner;

import fr.pizzeria.model.Pizza.Pizza;
import fr.pizzeria.model.menu.Menu;

public class main {

	public static void main(String[] args) {
		
		Pizza[] pizza={new Pizza(0,"PEP","P�p�roni",12.50),
				new Pizza(1,"MAR","P�p�roni",14.00),
				new Pizza(2,"REI","La Reine",11.00),
				new Pizza(3,"FRO","La 4 fromages",12.00),
				new Pizza(4,"CAN","La cannibale",12.50),
				new Pizza(5,"SAV","La savoyarde",13.00),
				new Pizza(6,"ORI","L'orientale",13.50),
				new Pizza(7,"IND","L'indienne",14.00)

		};
		Scanner sc = new Scanner (System.in);
		Menu menu= new Menu();
		menu.afficherLeMenu();
		int saisi1 = sc.nextInt();
		
		
		
		
		
		sc.close();
	}

}
