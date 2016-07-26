package clinet;

import builder.HtmlMenuBuilder;
import builder.TextMenuBuilder;
import menu.TodayMenu;

public class Client {

	public static void main(String[] args) {
		TodayMenu menu = new TodayMenu(new HtmlMenuBuilder());
		menu.todayMenuPrint();

		menu.setMenuBuilder(new TextMenuBuilder());
		menu.todayMenuPrint();
	}
}
