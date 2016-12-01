package devinstitut.abstractfactory.service;

import devinstitut.abstractfactory.service.client.ClientServicePostgresImpl;
import devinstitut.abstractfactory.service.commande.CommandeServicePostgresImpl;
import devinstitut.abstractfactory.service.pizza.PizzaServicePostgresImpl;

public class PostgresFactory extends AbstractFactory {
	public PostgresFactory() {
		super(new ClientServicePostgresImpl(), new CommandeServicePostgresImpl(), new PizzaServicePostgresImpl());
	}

}