package eu.hostcode.adminlte.nav.items;

import eu.hostcode.adminlte.nav.WidgetItem;

public class WidgetItemMessage extends WidgetItem {
	private String imagePath;
	private String from;
	private String ago;
	private String message;

	public WidgetItemMessage(String imagePath, String from, String ago, String message) {
		this.imagePath = imagePath;
		this.from = from;
		this.ago = ago;
		this.message = message;
	}

	public String getImagePath() {
		return imagePath;
	}

	public String getFrom() {
		return from;
	}

	public String getAgo() {
		return ago;
	}

	public String getMessage() {
		return message;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public void setAgo(String ago) {
		this.ago = ago;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String getHTML() {
		StringBuilder b = new StringBuilder();
		b.append("<li>\n");
		b.append("<a href=\"" + getHref() + "\">\n");
		b.append("<div class=\"pull-left\">\n");
		b.append("<img src=\"" + imagePath + "\" class=\"img-circle\" alt=\"User Image\">\n");
		b.append("</div>\n");
		b.append("<h4>\n");
		b.append(from + "\n");
		b.append("<small><i class=\"fa fa-clock-o\"></i>" + ago + "</small>\n");
		b.append("</h4>");
		b.append("<p>" + message + "</p>\n");
		b.append("</a>\n");
		b.append("</li>\n");
		return b.toString();
	}

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

}
