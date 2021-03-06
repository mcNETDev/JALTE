package eu.hostcode.adminlte.body.components.simple;

import eu.hostcode.adminlte.body.SimpleWebComponent;
import eu.hostcode.adminlte.sideBar.menu.BGColor;

public abstract class WebComponentInfoBoxProgress extends SimpleWebComponent {

	public abstract String getIcon();

	public abstract String getHeaderText();

	public abstract String getInnerText();

	public abstract BGColor getColor();

	public abstract int getProgress();

	public abstract String getDownText();

	@Override
	public String getHTML() {
		StringBuilder b = new StringBuilder();
		b.append("<div class=\"info-box " + getColor().getName() + "\">\n");
		b.append("<span class=\"info-box-icon\"><i class=\"fa " + getIcon() + "\"></i></span>\n");
		b.append("<div class=\"info-box-content\">\n");
		b.append("<span class=\"info-box-text\">" + getHeaderText() + "</span>\n");
		b.append("<span class=\"info-box-number\">" + getInnerText() + "</span>\n");
		b.append("<div class=\"progress\">\n");
		b.append("<div class=\"progress-bar\" style=\"width: " + getProgress() + "%\"></div>\n");
		b.append("</div>\n");
		b.append("<span class=\"progress-description\">\n");
		b.append(getDownText() + "\n");
		b.append("</span>");
		b.append("</div>\n");
		b.append("</div>\n");
		return b.toString();
	}

}
