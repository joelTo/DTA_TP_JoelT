package dta.chat;

import java.io.IOException;
import java.util.Scanner;

import dta.chat.controller.ChatAuthController;
import dta.chat.controller.ChatAuthControllerImpl;
import dta.chat.view.console.ChatConsoleView;

public class ChatClientApp {

	public static void main(String[] args) throws IOException {
		try(Scanner sc = new Scanner(System.in)) {
			
			final ChatConsoleView view = new ChatConsoleView(sc);
			/*view.setAuthController((login) -> {
				view.setLogin(login);
			});
			*/
			view.setAuthController(new ChatAuthControllerImpl(view));

			view.print();
		}
	}

	
	
	
	
	
}
