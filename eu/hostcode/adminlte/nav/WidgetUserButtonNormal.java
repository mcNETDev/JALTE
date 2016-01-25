package eu.hostcode.adminlte.nav;

import eu.hostcode.adminlte.util.HTMLAble;

public class WidgetUserButtonNormal implements HTMLAble {
	private String text;
	private String href;

	public WidgetUserButtonNormal(String text, String href) {
		this.text = text;
		this.href = href;
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

	@Override
	public String getHTML() {
		StringBuilder b = new StringBuilder();
		b.append("<div class=\"col-xs-4 text-center\">\n");
		b.append("<a href=\"" + href + "\">" + text + "</a>\n");
		b.append("</div>\n");
		return b.toString();
	}

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

}
