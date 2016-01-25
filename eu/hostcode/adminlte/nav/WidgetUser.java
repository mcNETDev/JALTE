package eu.hostcode.adminlte.nav;

import java.util.ArrayList;

public class WidgetUser extends Widget {
	private String imagePath;
	private String displayName;
	private String fullName;
	private String smallName;
	private ArrayList<WidgetUserButtonNormal> buttons;
	private ArrayList<WidgetUserButton> buttons2;

	public WidgetUser(String imagePath, String displayName, String fullName, String smallName) {
		this.imagePath = imagePath;
		this.displayName = displayName;
		this.fullName = fullName;
		this.smallName = smallName;
		buttons = new ArrayList<>();
		buttons2 = new ArrayList<>();
	}

	public ArrayList<WidgetUserButton> getButtonsDown() {
		return buttons2;
	}

	public void setButtonsDown(ArrayList<WidgetUserButton> buttons2) {
		this.buttons2 = buttons2;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getSmallName() {
		return smallName;
	}

	public void setSmallName(String smallName) {
		this.smallName = smallName;
	}

	public ArrayList<WidgetUserButtonNormal> getButtons() {
		return buttons;
	}

	public void setButtons(ArrayList<WidgetUserButtonNormal> buttons) {
		this.buttons = buttons;
	}

	@Override
	public String getHTML() {
		StringBuilder b = new StringBuilder();
		b.append("<li class=\"dropdown user user-menu\">\n");
		b.append("<a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
		b.append("<img src=\"" + imagePath + "\" class=\"user-image\" alt=\"User Image\">\n");
		b.append("<span class=\"hidden-xs\">" + displayName + "</span>\n");
		b.append("</a>\n");

		b.append("<ul class=\"dropdown-menu\">\n");
		b.append("<li class=\"user-header\">\n");
		b.append("<img src=\"" + imagePath + "\" class=\"img-circle\" alt=\"User Image\">\n");
		b.append("<p>\n");
		b.append(fullName + "\n");
		b.append("<small>" + smallName + "</small>\n");
		b.append("</p>\n");
		b.append("</li>\n");
		
		b.append("<li class=\"user-body\">\n");
		b.append("<div class=\"row\">\n");
		for(WidgetUserButtonNormal btn : buttons){
			b.append(btn.getHTML());
		}
		b.append("</div>");
		b.append("</li>\n");
		b.append("<li class=\"user-footer\">\n");
		for(WidgetUserButton btn2 : buttons2){
			b.append(btn2.getHTML());
		}
		b.append("</li>\n");
		b.append("</ul>\n");
		b.append("</li>\n");
		return b.toString();
	}

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

}
