package eu.hostcode.adminlte.body;

import java.util.ArrayList;

public abstract class StackableWebComponent extends WebComponent {
	private ArrayList<WebComponent> components;

	public StackableWebComponent() {
		components = new ArrayList<>();
	}

	public ArrayList<WebComponent> getComponents() {
		return components;
	}

	public boolean addWebComponent(WebComponent e) {
		return components.add(e);
	}

	public void setComponents(ArrayList<WebComponent> components) {
		this.components = components;
	}

}
