package fr.pizzeria.ihm.action;

import fr.pizzeria.ihm.IhmUtil;
import fr.pizzeria.model.Pizza;

public class ListPizzaTarifEleve extends Action {
	private IhmUtil ihmUtil;

	public ListPizzaTarifEleve(IhmUtil ihmUtil) {
		super();
		this.ihmUtil = ihmUtil;
		this.setDescription("1. Lister les pizzas");

	}

	@Override
	public void doAction() {
		System.out.println("je liste le prix le plus élevé par moins élevé");
		this.ihmUtil.getPizzaDao().findAll().stream().map(Pizza::getPrix).filter(t -> t > t)
				.forEach(System.out::println);
	}

	public void describeAction() {
		System.out.println(this.getDescription());
	}
}
