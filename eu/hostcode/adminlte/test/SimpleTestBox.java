package eu.hostcode.adminlte.test;

import eu.hostcode.adminlte.body.SimpleWebComponent;
import eu.hostcode.adminlte.body.WebComponent;
import eu.hostcode.adminlte.body.components.box.BoxFeature;
import eu.hostcode.adminlte.body.components.box.WebComponentBox;
import eu.hostcode.adminlte.body.components.box.features.BoxCollapsable;
import eu.hostcode.adminlte.body.components.box.features.BoxRemovable;
import eu.hostcode.adminlte.body.components.simple.WebComponentLabel;
import eu.hostcode.adminlte.util.LabelType;

public class SimpleTestBox extends WebComponentBox {

	private String title;

	public SimpleTestBox(String title) {
		super();
		this.title = title;
		addWebComponent(new SimpleWebComponent() {

			@Override
			public String getHTML() {
				return "<small>Box Body</small><br>Hi";
			}
		});
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public WebComponent getFooter() {
		return new SimpleWebComponent() {

			@Override
			public String getHTML() {
				return "<small>footer from " + title + "</small>";
			}
		};
	}

	@Override
	public BoxType getBoxType() {
		return BoxType.solid;
	}

	@Override
	public BoxColor getBoxColor() {
		return BoxColor.box_danger;
	}

	@Override
	public BoxFeature[] features() {
		return new BoxFeature[] { new WebComponentLabel() {

			@Override
			public LabelType getType() {
				return LabelType.warning;
			}

			@Override
			public String getText() {
				return "3 Messages";
			}
		}, new BoxCollapsable().setTooltip("MINUS"), new BoxRemovable().setTooltip("YOU WILL KILL ME ?") };
	}

	@Override
	public void init() {

	}

}
