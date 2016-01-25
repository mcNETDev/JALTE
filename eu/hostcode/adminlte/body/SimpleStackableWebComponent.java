package eu.hostcode.adminlte.body;

public abstract class SimpleStackableWebComponent extends StackableWebComponent {
	
	public SimpleStackableWebComponent() {
		super();
	}

	@Override
	public boolean isReady() {
		return true;
	}
}
