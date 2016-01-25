package eu.hostcode.adminlte.nav;

import eu.hostcode.adminlte.util.HTMLAble;

public abstract class WidgetItem implements HTMLAble {
	private String href;

	public String getHref() {
		return href;
	}

	public void setHref(String href) {
		this.href = href;
	}
}
