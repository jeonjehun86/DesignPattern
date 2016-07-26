package menu;

import builder.MenuBuilder;

public class TodayMenu {

	private MenuBuilder menuBuilder;

	public TodayMenu(MenuBuilder menuBuilder) {
		this.menuBuilder = menuBuilder;
	}

	public void setMenuBuilder(MenuBuilder menuBuilder) {
		this.menuBuilder = menuBuilder;
	}

	public void todayMenuPrint() {
		menuBuilder.makeTitle("오늘의 메뉴");

		menuBuilder.makeString("아침식단");
		String[] items = { "밥1", "국1", "반찬1" };
		menuBuilder.makeItems(items);

		menuBuilder.makeString("점심식단");
		String[] items2 = { "밥2", "국2", "반찬2" };
		menuBuilder.makeItems(items2);

		System.out.println(menuBuilder.getResult());
	}

}
