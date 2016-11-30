package devinstitut.abstractfactory.service;

import devinstitut.abstractfactory.service.client.ClientServiceMySQLImpl;
import devinstitut.abstractfactory.service.commande.CommandeServiceMysqlImpl;
import devinstitut.abstractfactory.service.pizza.PizzaServiceMySQLImpl;

public class MySQLFactory extends AbstractFactory {

	public MySQLFactory() {
		super(new ClientServiceMySQLImpl(), new CommandeServiceMysqlImpl(), new PizzaServiceMySQLImpl());
	}
}
