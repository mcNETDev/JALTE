package eu.hostcode.adminlte.sideBar.menu;

import eu.hostcode.adminlte.util.HTMLAble;

public class MenuItem implements HTMLAble {
	private String icon;
	private String text;
	private String href;
	private String label;
	private BGColor labelColor;
	private MenuItem sub;
	private boolean open;

	protected MenuItem(String icon2, String text2) {
		this.icon = icon2;
		this.text = text2;
		label = "";
	}

	public boolean isOpen() {
		return open || sub != null && sub.isOpen();
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public MenuItem getSub() {
		return sub;
	}

	public void setSub(MenuItem sub) {
		this.sub = sub;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
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

	/**
	 * <a href="pages/UI/buttons.html"><i class="fa fa-circle-o"></i>
	 * <small class="label pull-right bg-green">new</small>Buttons</a>
	 */
	@Override
	public String getHTML() {
		StringBuilder b = new StringBuilder();
		if (sub != null) {
			if (isOpen()) {
				b.append("<li class=\"active\">\n");
			} else {
				b.append("<li>\n");
			}
			b.append("<a href=\"#\"><i class=\"fa " + icon + "\"></i> " + text + " <i class=\"fa fa-angle-left pull-right\"></i></a>\n");
			b.append("<ul class=\"treeview-menu\">\n");
			b.append(sub.getHTML());
			b.append("</ul>\n");
			b.append("</li>\n");

		} else {
			String l = "";
			if (!label.isEmpty()) {
				l = "<small class=\"label pull-right " + labelColor.getName() + "\">" + label + "</small>";
			}
			b.append("<li><a href=\"" + href + "\"><i class=\"fa " + icon + "\"></i> " + text + l + "</a></li>\n");
		}
		return b.toString();
	}

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

}
