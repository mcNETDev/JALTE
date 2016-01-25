package eu.hostcode.adminlte.sideBar.menu;

import java.util.ArrayList;

import eu.hostcode.adminlte.util.HTMLAble;

public class Menu implements HTMLAble {
	private String title;
	private String icon;
	private boolean open;
	private String label;
	private String href;
	private BGColor labelColor;
	private ArrayList<MenuItem> items;

	protected Menu(String title, String icon) {
		this.title = title;
		this.icon = icon;
		this.open = false;
		label = "";
		this.items = new ArrayList<>();
	}

	public String getHref() {
		return href;
	}

	public MenuItem getNewMenuItem(String text, String icon, boolean addToList) {
		MenuItem item = new MenuItem(icon, text);
		if (addToList) {
			items.add(item);
		}
		return item;
	}

	public void setHref(String href) {
		this.href = href;
	}

	public void setItems(ArrayList<MenuItem> items) {
		this.items = items;
	}

	public ArrayList<MenuItem> getItems() {
		return items;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public boolean isOpen() {
		boolean b = open;
		for(MenuItem item : items){
			if(item.isOpen()){
				b = true;
			}
		}
		return b;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public BGColor getLabelColor() {
		return labelColor;
	}

	public void setLabelColor(BGColor labelColor) {
		this.labelColor = labelColor;
	}

	@Override
	public String getHTML() {
		StringBuilder b = new StringBuilder();
		if (items.size() > 0) {
			if (isOpen()) {
				b.append("<li class=\"active treeview\">\n");
			} else {
				b.append("<li class=\"treeview\">\n");
			}
			b.append("<a href=\"#\">\n");
			b.append("<i class=\"fa " + icon + "\"></i> <span>" + title + "</span> <i class=\"fa fa-angle-left pull-right\"></i>\n");
			b.append("</a>\n");
			b.append("<ul class=\"treeview-menu\">\n");
			for (MenuItem item : items) {
				b.append(item.getHTML());
			}
			b.append("</ul>\n");
			b.append("</li>\n");

			// b.append("</li>\n");
		} else {
			b.append("<li>");
			b.append("<a href=\"" + getHref() + "\">");
			b.append("<i class=\"fa " + icon + "\"></i> <span>" + title + "</span>");
			if (!label.isEmpty()) {
				b.append("<small class=\"label pull-right " + labelColor.getName() + "\">" + label + "</small>");
			}
			b.append("</a>");
			b.append("</li>");
		}
		return b.toString();
	}

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

}
