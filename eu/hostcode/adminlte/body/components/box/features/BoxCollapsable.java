package eu.hostcode.adminlte.body.components.box.features;

import eu.hostcode.adminlte.body.SimpleWebComponent;
import eu.hostcode.adminlte.body.components.box.BoxFeature;

public class BoxCollapsable extends BoxButtonTooltipable {

	@Override
	public String getHTML() {
		if (!getTooltip().isEmpty()) {
			return "<button class=\"btn btn-box-tool\" data-widget=\"collapse\" title=\"" + getTooltip() + "\"><i class=\"fa fa-minus\"></i></button>\n";
		}

		return "<button class=\"btn btn-box-tool\" data-widget=\"collapse\"><i class=\"fa fa-minus\"></i></button>\n";
	}

}