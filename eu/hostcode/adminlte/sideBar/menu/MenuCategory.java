package eu.hostcode.adminlte.sideBar.menu;

import java.util.ArrayList;

import eu.hostcode.adminlte.util.HTMLAble;

public class MenuCategory implements HTMLAble {
	private ArrayList<Menu> menus;
	private String title;

	protected MenuCategory(String title) {
		this.menus = new ArrayList<>();
		this.title = title;
	}

	public ArrayList<Menu> getMenus() {
		return menus;
	}

	public void setMenus(ArrayList<Menu> menus) {
		this.menus = menus;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getHTML() {
		StringBuilder b = new StringBuilder();
		b.append("<li class=\"header\">" + getTitle() + "</li>\n");
		for (Menu m : menus) {
			System.out.println("newMenue");
			b.append(m.getHTML());
		}

		return b.toString();
	}

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

	public Menu getNMenu(String title, String icon) {
		Menu m = new Menu(title, icon);
		menus.add(m);
		return m;
	}

}
