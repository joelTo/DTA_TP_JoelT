package dta.chat.controller;

import dta.chat.view.console.ChatConsoleView;

public class ChatAuthControllerImpl implements ChatAuthController{

	private ChatConsoleView view;
	
	public ChatAuthControllerImpl(ChatConsoleView view) {
		super();
		this.view = view;
	}

	@Override
	public void authenticate(String login) {
		view.setLogin(login);
	}

}
