package eu.hostcode.adminlte.body.util;

import eu.hostcode.adminlte.body.StackableWebComponent;
import eu.hostcode.adminlte.body.WebComponent;

public class WebComponentColumn extends StackableWebComponent {
	private ColumnType[] types;

	public WebComponentColumn(WebComponent... components) {
		super();
		if (components != null && components.length > 0) {
			for (WebComponent c : components) {
				if (c != null) {
					addWebComponent(c);
				}
			}
		}
	}

	public WebComponentColumn setTypes(ColumnType... columnTypes) {
		this.types = columnTypes;
		return this;
	}

	@Override
	public String getHTML() {
		StringBuilder b = new StringBuilder();
		if (types != null && types.length > 0 && types[0] != null) {
			String t = "";
			for (ColumnType tt : types) {
				t += tt + " ";
			}
			b.append("<div class=\"" + t + "\">\n");

			for (WebComponent c : getComponents()) {
				b.append(c.getHTML());
			}
			b.append("</div>\n");
		}

		return b.toString();
	}

	@Override
	public boolean isReady() {
		if (types != null && types.length > 0 && types[0] != null) {
			return true;
		} else {
			return false;
		}
	}

	public enum ColumnType {
		col_md_1, col_md_2, col_md_3, col_md_4, col_md_5, col_md_6, col_md_7, col_md_8, col_sm_1, col_sm_2, col_sm_3, col_sm_4, col_sm_5, col_sm_6, col_sm_7, col_sm_8, col_xs_1, col_xs_2, col_xs_3, col_xs_4, col_xs_5, col_xs_6, col_xs_7, col_xs_8, col_xs_9, col_xs_10, col_xs_11, col_xs_12;

		public String getName() {
			return name().replaceAll("_", "-");
		}

		@Override
		public String toString() {
			return name().replaceAll("_", "-");
		}
	}
}
