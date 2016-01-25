package eu.hostcode.adminlte.sideBar;

import eu.hostcode.adminlte.util.HTMLAble;
import eu.hostcode.adminlte.util.TextColor;

public class SideBarUser implements HTMLAble {
	private String imagePath;
	private String name;
	private TextColor statusColor;
	private String status;
	private String statusClickhref;

	public SideBarUser(String imagePath, String name, TextColor statusColor, String status, String statusClickhref) {
		this.imagePath = imagePath;
		this.name = name;
		this.statusColor = statusColor;
		this.status = status;
		this.statusClickhref = statusClickhref;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TextColor getStatusColor() {
		return statusColor;
	}

	public void setStatusColor(TextColor statusColor) {
		this.statusColor = statusColor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatusClickhref() {
		return statusClickhref;
	}

	public void setStatusClickhref(String statusClickhref) {
		this.statusClickhref = statusClickhref;
	}

	@Override
	public String getHTML() {
		StringBuilder b = new StringBuilder();
		b.append("<div class=\"user-panel\">\n");
		b.append("<div class=\"pull-left image\">\n");
		b.append("<img src=\"" + imagePath + "\" class=\"img-circle\" alt=\"User Image\">\n");
		b.append("</div>\n");
		b.append("<div class=\"pull-left info\">\n");
		b.append("<p>" + name + "</p>\n");
		b.append("<a href=\"" + statusClickhref + "\"><i class=\"fa fa-circle " + statusColor.getText() + "\"></i> " + status + "</a>\n");
		b.append("</div>\n");
		b.append("</div>\n");
		return b.toString();
	}

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

}
