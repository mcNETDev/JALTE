package eu.hostcode.adminlte.body.components.box.features;

import eu.hostcode.adminlte.body.SimpleWebComponent;
import eu.hostcode.adminlte.body.components.box.BoxFeature;

public abstract class BoxButtonTooltipable extends SimpleWebComponent implements BoxFeature {

	private String tooltip;

	public BoxButtonTooltipable() {
		this.tooltip = "";
	}

	public String getTooltip() {
		return tooltip;
	}

	/**
	 * emtpy string for nothing
	 * 
	 */
	public BoxFeature setTooltip(String tooltip) {
		this.tooltip = tooltip;
		return this;
	}
	
}
