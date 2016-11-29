package fr.pizzeria.ihm.action;

import fr.pizzeria.ihm.IhmUtil;
import fr.pizzeria.model.Pizza;

public class ListPizzaGroupeCategorie extends Action {

	private IhmUtil ihmUtil;

	public ListPizzaGroupeCategorie(IhmUtil ihmUtil) {
		super();
		this.ihmUtil = ihmUtil;
		this.setDescription("1. Lister les pizzas");
	}

	@Override
	public void doAction() {
		System.out.println("Affichage des pizzas par catégories");
		this.ihmUtil.getPizzaDao().findAll().stream().map(Pizza::getCode).forEach(System.out::println);
	}

	@Override
	public void describeAction() {
		System.out.println(this.getDescription());
	}
}
