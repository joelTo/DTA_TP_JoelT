package fr.pizzeria.ihm.action;

public class ExitMenu extends Action {

	public ExitMenu() {
		super();
		this.setDescription("Sortir");
	}

	@Override
	public void doAction() {
		System.out.println("AU REVOIR :'(");
		fr.pizzeria.console.PizzeriaAdminConsoleApp.Arret = true;
	}

	@Override
	public void describeAction() {
		System.out.println(this.getDescription());
	}

}
