package devinstitut.abstractfactory.service;

import devinstitut.abstractfactory.service.client.ClientServiceOracleImpl;
import devinstitut.abstractfactory.service.commande.CommandeServiceOracleImpl;
import devinstitut.abstractfactory.service.pizza.PizzaServiceOracleImpl;

public class OracleFactory extends AbstractFactory {

	public OracleFactory() {
		super(new ClientServiceOracleImpl(), new CommandeServiceOracleImpl(), new PizzaServiceOracleImpl());
	}

}