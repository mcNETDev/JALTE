package eu.hostcode.adminlte.nav;

import java.util.ArrayList;

import eu.hostcode.adminlte.util.HTMLAble;

public class NavigationBar implements HTMLAble {
	private ArrayList<Widget> widgets;

	public NavigationBar() {
		widgets = new ArrayList<>();
	}

	public boolean addWidget(Widget e) {
		return widgets.add(e);
	}

	public boolean removeWidget(Widget o) {
		return widgets.remove(o);
	}

	@Override
	public String getHTML() {
		StringBuilder builder = new StringBuilder();
		builder.append("<nav class=\"navbar navbar-static-top\" role=\"navigation\">\n");
		builder.append("<a href=\"#\" class=\"sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\n");
		builder.append("<span class=\"sr-only\">Toggle navigation</span>\n");
		builder.append("</a>\n");
		if (widgets.size() > 0) {
			builder.append("<div class=\"navbar-custom-menu\">\n");
			builder.append("<ul class=\"nav navbar-nav\">\n");
			for (Widget wi : widgets) {
				builder.append(wi.getHTML());
			}
			builder.append("</ul>\n");
			builder.append("</div>");
		}
		builder.append("</nav>\n");
		builder.append("</header>\n");
		return builder.toString();
	}

	@Override
	public boolean isReady() {
		return true;
	}

}
