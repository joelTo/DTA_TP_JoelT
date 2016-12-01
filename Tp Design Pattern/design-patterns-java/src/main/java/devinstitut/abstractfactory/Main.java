package devinstitut.abstractfactory;

import devinstitut.abstractfactory.service.AbstractFactory;
import devinstitut.abstractfactory.service.OracleFactory;

public class Main {

	public static void main(String[] args) {
		AbstractFactory factory = new OracleFactory();
		// AbstractFactory factory = new PostgresFactory();
		// AbstractFactory factory = new MySQLFactory();

		factory.getClientService().afficherDonneesClient();
		factory.getCommandeService().afficherDonneesCommande();
		factory.getPizzaService().afficherDonneesPizza();
	}
}
