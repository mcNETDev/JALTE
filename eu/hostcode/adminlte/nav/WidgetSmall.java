package eu.hostcode.adminlte.nav;

import java.util.ArrayList;

import eu.hostcode.adminlte.util.HTMLAble;
import eu.hostcode.adminlte.util.LabelType;

public class WidgetSmall extends Widget {
	private String icon;
	private String label;
	private LabelType labelType;
	private ArrayList<WidgetItem> items;
	private String titleTop;
	private String titlebottom;
	private String titlebottomLink;
	private WidgetType type;

	public WidgetSmall(String icon,WidgetType type) {
		this.icon = icon;
		this.label = "";
		this.type = type;
		this.items = new ArrayList<WidgetItem>();
	}

	public WidgetType getType() {
		return type;
	}

	public void setType(WidgetType type) {
		this.type = type;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public void setItems(ArrayList<WidgetItem> items) {
		this.items = items;
	}

	public void setTitleTop(String titleTop) {
		this.titleTop = titleTop;
	}

	public void setTitlebottom(String titlebottom) {
		this.titlebottom = titlebottom;
	}

	public void setTitlebottomLink(String titlebottomLink) {
		this.titlebottomLink = titlebottomLink;
	}

	public String getIcon() {
		return icon;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public LabelType getLabelType() {
		return labelType;
	}

	public void setLabelType(LabelType labelType) {
		this.labelType = labelType;
	}

	public ArrayList<WidgetItem> getItems() {
		return items;
	}

	public String getTitleTop() {
		return titleTop;
	}

	public String getTitlebottom() {
		return titlebottom;
	}

	public String getTitlebottomLink() {
		return titlebottomLink;
	}

	@Override
	public String getHTML() {
		StringBuilder b = new StringBuilder();
		b.append("<li class=\"dropdown " + type.getName() + "\">\n");

		b.append("<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
		b.append("<i class=\"fa " + icon + "\"></i>\n");
		if(!label.isEmpty()){
			b.append("<span class=\"label " + labelType.getName() + "\">" + label + "</span>\n");
		}
		b.append("</a>\n");

		b.append("<ul class=\"dropdown-menu\">\n");
		b.append("<li class=\"header\">" + titleTop + "</li>\n");
		b.append("<li>\n");
		b.append("<ul class=\"menu\">\n");
		for (WidgetItem i : items) {
			b.append(i.getHTML());
		}
		b.append("</ul>\n");
		b.append("</li>\n");
		b.append("<li class=\"footer\"><a href=\"" + titlebottomLink + "\">" + titlebottom + "</a></li>\n");
		b.append("</ul>\n");
		b.append("</li>\n");

		return b.toString();
	}

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

}
