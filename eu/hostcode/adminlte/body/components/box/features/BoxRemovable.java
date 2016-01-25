package eu.hostcode.adminlte.body.components.box.features;

import eu.hostcode.adminlte.body.SimpleWebComponent;
import eu.hostcode.adminlte.body.components.box.BoxFeature;

public class BoxRemovable extends BoxButtonTooltipable {

	@Override
	public String getHTML() {
		if (!getTooltip().isEmpty()) {
			return "<button class=\"btn btn-box-tool\" data-widget=\"remove\" title=\"" + getTooltip() + "\"><i class=\"fa fa-times\"></i></button>\n";
		}
		return "<button class=\"btn btn-box-tool\" data-widget=\"remove\"><i class=\"fa fa-times\"></i></button>\n";
	}

}
