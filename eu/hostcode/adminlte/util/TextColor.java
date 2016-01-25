package eu.hostcode.adminlte.util;

public enum TextColor {
	yellow("text-yellow");
	private String text;

	private TextColor(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

}
