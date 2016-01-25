package eu.hostcode.adminlte.body.components.simple;

import eu.hostcode.adminlte.body.SimpleWebComponent;
import eu.hostcode.adminlte.body.components.box.BoxFeature;
import eu.hostcode.adminlte.util.LabelType;

public abstract class WebComponentLabel extends SimpleWebComponent implements BoxFeature {

	@Override
	public String getHTML() {
		return "<span class=\"label " + getType().getName() + "\">" + getText() + "</span>\n";
	}

	public abstract LabelType getType();

	public abstract String getText();
}
