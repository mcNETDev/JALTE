package eu.hostcode.adminlte.util;

public enum ProgressBarColor {
	aqua("progress-bar-aqua");
	private String text;

	private ProgressBarColor(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

}
