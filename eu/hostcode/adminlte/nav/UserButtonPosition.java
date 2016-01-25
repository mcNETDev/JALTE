package eu.hostcode.adminlte.nav;

public enum UserButtonPosition {
	left("pull-left"), right("pull-right");
	private String name;

	private UserButtonPosition(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
