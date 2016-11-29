package fr.pizzeria.ihm.action;

import java.util.Collections;

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
		System.out.println("Affichage des pizzas par cat�gories");
		// this.ihmUtil.getPizzaDao().findAll().stream().collect(Collectors.groupingBy(Pizza::getCatPizza))
		// .forEach(System.out::println);
		this.ihmUtil.getPizzaDao().findAll().stream().collect(Collections.groupingBy(Pizza -> Pizza::getCatPizza));
	}

	@Override
	public void describeAction() {
		System.out.println(this.getDescription());
	}
}
