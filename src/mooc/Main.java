package mooc;

import mooc.ui.UserInterface;
import mooc.logic.ApplicationLogic;
import mooc.ui.TextInterface;


public class Main {
	public static void main(String[] args) {
        UserInterface ui = new TextInterface();
        new ApplicationLogic(ui).execute(3);
    }
}
