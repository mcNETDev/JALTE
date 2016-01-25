package eu.hostcode.adminlte.body.components.box;

import org.apache.tomcat.util.http.HttpMessages;

import eu.hostcode.adminlte.body.SimpleStackableWebComponent;
import eu.hostcode.adminlte.body.StackableWebComponent;
import eu.hostcode.adminlte.body.WebComponent;
import eu.hostcode.adminlte.util.HTMLAble;
import eu.hostcode.adminlte.util.Initable;

public abstract class WebComponentBox extends SimpleStackableWebComponent implements Initable {

	public WebComponentBox() {
		super();
	}

	public abstract BoxType getBoxType();

	public abstract BoxColor getBoxColor();

	/**
	 * Optional
	 * 
	 * Current Box feature are - WebComponentLabel - BoxCollapsable -
	 * BoxExpandable - BoxRemovable
	 */
	public abstract BoxFeature[] features();

	/**
	 * Optional
	 */
	public abstract WebComponent getFooter();

	public abstract String getTitle();

	@Override
	public String getHTML() {
		init();
		StringBuilder b = new StringBuilder();
		switch (getBoxType()) {
		case header:
			b.append("<div class=\"box " + getBoxColor().getName() + "\">\n");
			break;
		case solid:
			b.append("<div class=\"box box-solid " + getBoxColor().getName() + "\">\n");
			break;
		}
		b.append("<div class=\"box-header with-border\">\n");
		b.append("<h3 class=\"box-title\">" + getTitle() + "</h3>\n");
		BoxFeature[] features = features();
		if (features != null && features.length > 0) {
			b.append("<div class=\"box-tools pull-right\">\n");
			for (BoxFeature f : features) {
				if (f != null && f instanceof HTMLAble) {
					HTMLAble ff = (HTMLAble) f;
					b.append(ff.getHTML());
				}
			}
			b.append("</div>\n");
		}
		b.append("</div>\n");
		b.append("<div class=\"box-body\">\n");
		for (WebComponent w : getComponents()) {
			b.append(w.getHTML());
		}
		b.append("</div>\n");
		WebComponent footer = getFooter();
		if (footer != null) {
			b.append("<div class=\"box-footer\">\n");
			b.append(footer.getHTML());
			b.append("</div>\n");
		}
		b.append("</div>\n");
		return b.toString();
	}

	public enum BoxType {
		header, solid
	}

	public enum BoxColor {
		box_default, box_primary, box_info, box_warning, box_success, box_danger;

		public String getName() {
			return name().replaceAll("_", "-");
		}
	}
}
