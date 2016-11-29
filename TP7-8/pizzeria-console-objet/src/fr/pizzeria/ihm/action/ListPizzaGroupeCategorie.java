package fr.pizzeria.ihm.action;

import fr.pizzeria.ihm.IhmUtil;
import fr.pizzeria.model.Pizza;

public class ListPizzaGroupeCategorie extends Action {

	private IhmUtil ihmUtil;

	public ListPizzaGroupeCategorie(IhmUtil ihmUtil) {
		super();
		this.ihmUtil = ihmUtil;
		this.setDescription("Liste les pizza par groupe categorie");
	}

	@Override
	public void doAction() {
		System.out.println("Affichage des pizzas par catégories");
		this.ihmUtil.getPizzaDao().findAll().stream().map(Pizza::getCatPizza).forEach(System.out::println);
	}

	@Override
	public void describeAction() {
		System.out.println(this.getDescription());
	}
}
