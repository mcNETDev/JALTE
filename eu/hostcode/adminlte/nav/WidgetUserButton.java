package eu.hostcode.adminlte.nav;

public class WidgetUserButton extends WidgetUserButtonNormal {
	private UserButtonPosition pos;

	public WidgetUserButton(String text, String href, UserButtonPosition pos) {
		super(text, href);
		this.pos = pos;
	}

	public UserButtonPosition getPos() {
		return pos;
	}

	public void setPos(UserButtonPosition pos) {
		this.pos = pos;
	}

	@Override
	public String getHTML() {
		StringBuilder b = new StringBuilder();
		b.append("<div class=\"" + pos.getName() + "\">\n");
		b.append("<a href=\"" + getHref() + "\" class=\"btn btn-default btn-flat\">" + getText() + "</a>\n");
		b.append("</div>\n");
		return b.toString();
	}

	@Override
	public boolean isReady() {
		// TODO Auto-generated method stub
		return false;
	}

}
