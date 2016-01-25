package eu.hostcode.adminlte;

import java.util.ArrayList;

import eu.hostcode.adminlte.body.WebComponent;
import eu.hostcode.adminlte.body.util.WebComponentColumn;
import eu.hostcode.adminlte.body.util.WebComponentRow;
import eu.hostcode.adminlte.util.HTMLAble;

public class PageBody implements HTMLAble {
	private String title;
	private String subTitle;
	private ArrayList<WebComponent> comps;

	public PageBody() {
		comps = new ArrayList<>();
	}

	public WebComponentRow addNewRow(WebComponent... comp) {
		WebComponentRow row = new WebComponentRow(comp);
		comps.add(row);
		return row;
	}
	public WebComponentColumn addNewColumn(WebComponent... comp) {
		WebComponentColumn row = new WebComponentColumn(comp);
		comps.add(row);
		return row;
	}
	public boolean addWebComponent(WebComponent e) {
		return comps.add(e);
	}

	public boolean containsWebComponent(WebComponent o) {
		return comps.contains(o);
	}

	public ArrayList<WebComponent> getComps() {
		return comps;
	}

	public void setComps(ArrayList<WebComponent> comps) {
		this.comps = comps;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

	@Override
	public String getHTML() {
		StringBuilder b = new StringBuilder();
		b.append("<div style=\"min-height: 916px;\" class=\"content-wrapper\">\n");
		b.append("<section class=\"content-header\">\n");
		b.append("<h1>" + title + "<small>" + subTitle + "</small></h1>\n");
		b.append("</section>\n");
		b.append("<section class=\"content\">\n");
		for (WebComponent com : comps) {
			b.append(com.getHTML());
		}
		b.append("\n");// Web content HERE
		b.append("</section>\n");
		b.append("</div>\n");
		return b.toString();
	}

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

	public void addWebComponent(WebComponent... components) {
		if (components != null && components.length > 0) {
			for (WebComponent c : components) {
				if (c != null) {
					comps.add(c);
				}
			}
		}

	}

}
