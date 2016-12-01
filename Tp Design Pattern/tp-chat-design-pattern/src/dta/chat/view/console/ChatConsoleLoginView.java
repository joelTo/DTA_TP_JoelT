package dta.chat.view.console;

import java.util.Observable;
import java.util.Observer;
import java.util.Scanner;

import dta.chat.controller.ChatAuthController;

public class ChatConsoleLoginView extends ViewComposite implements Observer {

	private Scanner sc;
	private ChatAuthController ctrl;

	public ChatConsoleLoginView(Scanner sc) {
		super();
		this.sc = sc;
	}

	public void setAuthController(ChatAuthController controller) {
		this.ctrl = controller;
	}

	@Override
	public void print() {
		System.out.println("== Authentification ==");
		System.out.print("Veuillez saisir votre login : ");
		String login = this.sc.next();
		ctrl.authenticate(login);
	}

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Ca y est!! ");

	}

}
