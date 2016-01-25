package eu.hostcode.adminlte.nav.items;

import eu.hostcode.adminlte.nav.WidgetItem;
import eu.hostcode.adminlte.util.HTMLAble;
import eu.hostcode.adminlte.util.ProgressBarColor;

public class WidgetItemProgress extends WidgetItem {
	private String title;
	private ProgressBarColor color;
	private int percent;

	public WidgetItemProgress(String title, ProgressBarColor color, int percent) {
		this.title = title;
		this.color = color;
		this.percent = percent;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public ProgressBarColor getColor() {
		return color;
	}

	public void setColor(ProgressBarColor color) {
		this.color = color;
	}

	public int getPercent() {
		return percent;
	}

	public void setPercent(int percent) {
		this.percent = percent;
	}

	@Override
	public String getHTML() {
		StringBuilder b = new StringBuilder();
		b.append("<li>\n");
		b.append("<a href=\"" + getHref() + "\">\n");
		b.append("<h3>" + title + "\n");
		b.append("<small class=\"pull-right\">" + percent + "%</small>\n");
		b.append("</h3>\n");
		b.append("<div class=\"progress xs\">\n");
		b.append("<div class=\"progress-bar " + color.getText() + "\" style=\"width: " + percent + "%\" role=\"progressbar\" aria-valuenow=\"20\" aria-valuemin=\"0\" aria-valuemax=\"100\">\n");
		b.append("<span class=\"sr-only\">" + percent + "% Complete</span>\n");
		b.append("</div>\n");
		b.append("</div>\n");
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
