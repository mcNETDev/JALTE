package eu.hostcode.adminlte.body.util;

import eu.hostcode.adminlte.body.StackableWebComponent;
import eu.hostcode.adminlte.body.WebComponent;

public class WebComponentRow extends StackableWebComponent {

	public WebComponentRow(WebComponent... components) {
		super();
		if (components != null && components.length > 0) {
			for (WebComponent c : components) {
				if (c != null) {
					addWebComponent(c);
				}
			}
		}
	}

	@Override
	public String getHTML() {
		if (!isReady()) {
			throw new NullPointerException("no web components found for a row!");
		}
		StringBuilder b = new StringBuilder();
		b.append("<div class=\"row\">\n");
		for (WebComponent web : getComponents()) {
			b.append(web.getHTML());
		}
		b.append("</div>\n");

		return b.toString();
	}

	@Override
	public boolean isReady() {
		return getComponents().size() > 0;
	}

}
