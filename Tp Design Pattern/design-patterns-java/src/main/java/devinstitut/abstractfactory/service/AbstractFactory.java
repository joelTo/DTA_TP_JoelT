package devinstitut.abstractfactory.service;

import devinstitut.abstractfactory.service.client.ClientService;
import devinstitut.abstractfactory.service.commande.CommandeService;
import devinstitut.abstractfactory.service.pizza.PizzaService;

public abstract class AbstractFactory {

	private ClientService clientService;
	private CommandeService commandeService;
	private PizzaService pizzaService;

	public AbstractFactory(ClientService clientService, CommandeService commandeService, PizzaService pizzaService) {
		this.clientService = clientService;
		this.commandeService = commandeService;
		this.pizzaService = pizzaService;
	}

	public ClientService getClientService() {
		return clientService;
	}

	public CommandeService getCommandeService() {
		return commandeService;
	}

	public PizzaService getPizzaService() {
		return pizzaService;
	}
}
