package fr.pizzeria.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.model.Pizza;

public class TraitementFichiers {
	private File file = new File("PizzaFiles");

	public void printlistFile() {
		List<String> code = listCodesPizza();
		// for each name in the path array
		for (String path : code) {
			// prints filename and directory name
			System.out.println(path);
		}
	}

	/**
	 * Retourne une liste de nom de fichier des pizzas. Ce sont donc les noms
	 * des pizzas
	 * 
	 * @return List type ArrayList
	 */
	private List<String> listCodesPizza() {
		String[] paths = file.list();
		List<String> stringList = new ArrayList<String>(Arrays.asList(paths));
		return stringList;
	}

	public void saveFile(Pizza pizza) throws SavePizzaException {
		if (isPresent(pizza)) {
			/**
			 * Pour dire que le code de cette pizza existe deja
			 */
			throw new SavePizzaException();
		}
		writePizza(pizza);
	}

	private void writePizza(Pizza pizza) {
		// Path f = Paths.get(file + "/" + pizza.getCode() + ".txt");
		File f = new File(file + "/" + pizza.getCode() + ".txt");
		f
		Files(f, (pizza.getNom() + ";" + pizza.getPrix() + ";" + pizza.getCatPizza()));
	}

	/**
	 * Test de la presence d'un nom identique de code de pizza dans le fichier
	 * de base "PizzasFiles"
	 * 
	 * @param pizza
	 * @return
	 */
	private boolean isPresent(Pizza pizza) {
		return listCodesPizza().stream().filter(t -> t.equals(pizza.getCode())).findFirst().isPresent();
	}

	/**
	 * Renvoi le nombre de fichier dans le dossier de base des pizzas
	 * "PizzasFiles"
	 * 
	 * @return
	 */
	private Integer pizzaNumber() {
		String[] paths = file.list();
		return paths.length;
	}
}
