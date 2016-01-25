package eu.hostcode.adminlte.sideBar.menu;

public enum BGColor {
	green("bg-green"), red("bg-red");
	
	private String name;

	private BGColor(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
