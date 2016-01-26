package eu.hostcode.adminlte.test;

import java.awt.Font;

import eu.hostcode.adminlte.body.components.simple.WebComponentInfoBoxStats;
import eu.hostcode.adminlte.sideBar.menu.BGColor;
import eu.hostcode.adminlte.util.FontAwesome;

public class SimpleTestStatBox extends WebComponentInfoBoxStats{

	
	private BGColor col;

	public SimpleTestStatBox(BGColor col) {
		this.col = col;
	}
	@Override
	public String getHeaderTitle() {
		return "Header";
	}

	@Override
	public String getTitle() {
		return "Normal Title";
	}

	@Override
	public String getLargeIcon() {
		return FontAwesome.SHARE;
	}

	@Override
	public BGColor getColor() {
		return col;
	}

	@Override
	public String getFooterTitle() {
		return "Footer Title";
	}

	@Override
	public String getFooterLink() {
		return "#Footer_Link";
	}

	@Override
	public String getFooterIcon() {
		return FontAwesome.ARROW_CIRCLE_O_RIGHT;
	}

}
