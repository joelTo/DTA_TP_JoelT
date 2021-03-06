package fr.pizzeria.dao;

import java.util.ArrayList;

import fr.pizzeria.exception.DeletePizzaException;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.UpdatesPizzaException;
import fr.pizzeria.model.CategoriePizza;
import fr.pizzeria.model.Pizza;

public interface PizzaDaoFactory {

	ArrayList<Pizza> findAll();

	void save(String code, String nom, CategoriePizza catPizza, Double prix) throws SavePizzaException;

	void supprime(int numPizzaSupprimee) throws DeletePizzaException;

	void update(String numPizza, String code, String nom, CategoriePizza catPizza, Double prix)
			throws UpdatesPizzaException;

}
