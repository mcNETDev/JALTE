package eu.hostcode.adminlte.util;

public enum LabelType {
	success("label-success"), warning("label-warning"), danger("label-danger");
	private String name;

	private LabelType(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
