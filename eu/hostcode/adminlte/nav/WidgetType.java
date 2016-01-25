package eu.hostcode.adminlte.nav;

public enum WidgetType {
	message("messages-menu"), notification("notifications-menu"), progress("tasks-menu");
	private String name;

	private WidgetType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
