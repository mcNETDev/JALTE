package eu.hostcode.adminlte.body.components.simple;

import eu.hostcode.adminlte.body.SimpleWebComponent;
import eu.hostcode.adminlte.sideBar.menu.BGColor;

public abstract class WebComponentInfoBoxStats extends SimpleWebComponent {

	public abstract String getHeaderTitle();

	public abstract String getTitle();

	public abstract String getLargeIcon();

	public abstract BGColor getColor();

	public abstract String getFooterTitle();

	public abstract String getFooterLink();

	public abstract String getFooterIcon();

	@Override
	public String getHTML() {
		StringBuilder b = new StringBuilder();
		b.append("<div class=\"small-box " + getColor().getName() + "\">\n");
		b.append("<div class=\"inner\">\n");
		b.append("<h3>" + getHeaderTitle() + "</h3>\n");
		b.append("<p>" + getTitle() + "</p>\n");
		b.append("</div>\n");
		b.append("<div class=\"icon\">\n");
		b.append("<i class=\"fa " + getLargeIcon() + "\"></i>\n");
		b.append("</div>\n");
		b.append("<a href=\"" + getFooterLink() + "\" class=\"small-box-footer\">\n");
		b.append(getFooterTitle() + "\n");
		if (!getFooterIcon().isEmpty()) {
			b.append("<i class=\"fa " + getFooterIcon() + "\"></i>\n");
		}
		b.append("</a>\n");
		b.append("</div>\n");

		return b.toString();
	}

}
