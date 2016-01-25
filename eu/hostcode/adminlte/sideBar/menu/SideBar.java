package eu.hostcode.adminlte.sideBar.menu;

import java.util.ArrayList;

import eu.hostcode.adminlte.sideBar.SideBarUser;
import eu.hostcode.adminlte.util.HTMLAble;

public class SideBar implements HTMLAble {
	private SideBarUser user;
	private ArrayList<MenuCategory> menus;

	public SideBar() {
		this.menus = new ArrayList<>();
	}

	public SideBarUser getUser() {
		return user;
	}

	public void setUser(SideBarUser user) {
		this.user = user;
	}

	public ArrayList<MenuCategory> getMenus() {
		return menus;
	}
	public MenuCategory getNewMenuCategory(String title){
		MenuCategory cat = new MenuCategory(title);
		menus.add(cat);
		return cat;
	}
	
	@Override
	public String getHTML() {
		StringBuilder b = new StringBuilder();
		b.append("<aside class=\"main-sidebar\">\n");
		b.append("<section class=\"sidebar\">\n");
		if(user != null){
			b.append(user.getHTML());
		}
		//Menu
		b.append("<ul class=\"sidebar-menu\">\n");
		for(MenuCategory cat : menus){
			b.append(cat.getHTML());
		}
		b.append("</ul>\n");
		b.append("</section>\n");
		b.append("</aside>\n");
		return b.toString();
	}

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

}
