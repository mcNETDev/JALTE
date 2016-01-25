package eu.hostcode.adminlte.nav.items;

import eu.hostcode.adminlte.nav.WidgetItem;
import eu.hostcode.adminlte.util.TextColor;

public class WidgetItemNotification extends WidgetItem {
	private String icon;
	private TextColor iconColor;
	private String text;

	public WidgetItemNotification(String icon, TextColor iconColor, String text) {
		super();
		this.icon = icon;
		this.iconColor = iconColor;
		this.text = text;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public TextColor getIconColor() {
		return iconColor;
	}

	public void setIconColor(TextColor iconColor) {
		this.iconColor = iconColor;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String getHTML() {
		StringBuilder b = new StringBuilder();
		b.append("<li>\n");
		b.append("<a href=\"" + getHref() + "\">\n");
		b.append("<i class=\"fa " + icon + " " + iconColor + "\"></i>" + text + "\n");
		b.append("</a>\n");
		b.append("</li>\n");

		b.append(
				"<li class=\"dropdown notifications-menu\"><a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"fa fa-bell-o\"></i>              <span class=\"label label-warning\">10</span>            </a>            <ul class=\"dropdown-menu\">              <li class=\"header\">You have 10 notifications</li>              <li>                <!-- inner menu: contains the actual data -->                <ul class=\"menu\">                  <li>                    <a href=\"#\">                      <i class=\"fa fa-users text-aqua\"></i> 5 new members joined today                    </a>                  </li>                  <li>                    <a href=\"#\">                      <i class=\"fa fa-warning text-yellow\"></i> Very long description here that may not fit into the                      page and may cause design problems                    </a>                  </li>                  <li>                    <a href=\"#\">                      <i class=\"fa fa-users text-red\"></i> 5 new members joined                    </a>                  </li>                  <li>                    <a href=\"#\">                      <i class=\"fa fa-shopping-cart text-green\"></i> 25 sales made                    </a>                  </li>                  <li>                    <a href=\"#\">                      <i class=\"fa fa-user text-red\"></i> You changed your username                    </a>                  </li>                </ul>              </li>              <li class=\"footer\"><a href=\"#\">View all</a></li>            </ul>          </li>");
		return b.toString();
	}

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

}
