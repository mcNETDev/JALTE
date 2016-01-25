package eu.hostcode.adminlte.body;

import eu.hostcode.adminlte.body.WebComponent;

public abstract class SimpleWebComponent extends WebComponent {

	@Override
	public boolean isReady() {
		return true;
	}

}
