package eu.hostcode.adminlte.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.hostcode.adminlte.Page;
import eu.hostcode.adminlte.PageBody;
import eu.hostcode.adminlte.body.SimpleWebComponent;
import eu.hostcode.adminlte.body.components.simple.WebComponentInfoBox;
import eu.hostcode.adminlte.body.components.simple.WebComponentInfoBoxProgress;
import eu.hostcode.adminlte.nav.NavigationBar;
import eu.hostcode.adminlte.nav.UserButtonPosition;
import eu.hostcode.adminlte.nav.WidgetSmall;
import eu.hostcode.adminlte.nav.WidgetType;
import eu.hostcode.adminlte.nav.WidgetUser;
import eu.hostcode.adminlte.nav.WidgetUserButton;
import eu.hostcode.adminlte.nav.WidgetUserButtonNormal;
import eu.hostcode.adminlte.nav.items.WidgetItemMessage;
import eu.hostcode.adminlte.nav.items.WidgetItemProgress;
import eu.hostcode.adminlte.sideBar.menu.BGColor;
import eu.hostcode.adminlte.sideBar.menu.Menu;
import eu.hostcode.adminlte.sideBar.menu.MenuCategory;
import eu.hostcode.adminlte.sideBar.menu.MenuItem;
import eu.hostcode.adminlte.sideBar.menu.SideBar;
import eu.hostcode.adminlte.util.FontAwesome;
import eu.hostcode.adminlte.util.LabelType;
import eu.hostcode.adminlte.util.ProgressBarColor;
import eu.hostcode.adminlte.util.Skin;

@WebServlet("/TestPage")
public class TestPage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TestPage() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Page page = new Page("Test", request, response);
		page.setSkin(Skin.skin_blue); // Dont work?
		page.setLogoLink("#");
		page.setSmallTitle("T2");
		page.setLargeTitle("TestPage");
		page.setFooter("<strong>Testing website for JALTE</strong>");
		page.setFooterRight("<small>by mcNET</small>");
		page.getPageBody().setSubTitle("Small Title");
		page.getPageBody().setTitle("Blank Page");

		NavigationBar bar = page.getNavigationBar();
		WidgetSmall small = new WidgetSmall(FontAwesome.ADJUST, WidgetType.progress);
		small.setTitlebottom("Click here");
		small.setTitlebottomLink("#bottom");
		small.setTitleTop("Top Title");
		WidgetItemProgress progress1 = new WidgetItemProgress("test1", ProgressBarColor.aqua, 10);
		WidgetItemProgress progress2 = new WidgetItemProgress("test2", ProgressBarColor.aqua, 77);
		progress1.setHref("#Progress1");
		progress2.setHref("#Progress2");
		small.getItems().add(progress1);
		small.getItems().add(progress2);
		bar.addWidget(small);

		WidgetSmall s2 = new WidgetSmall(FontAwesome.TELEVISION, WidgetType.message);
		s2.setLabel("2");
		s2.setLabelType(LabelType.warning);
		s2.setTitlebottom("See all Messages");
		s2.setTitlebottomLink("#allMessages");
		s2.setTitleTop("Last Messages");

		WidgetItemMessage message = new WidgetItemMessage("avatar.png", "TiSan", "10 min", "Hey wie geht es dir?");
		WidgetItemMessage message2 = new WidgetItemMessage("avatar.png", "Balscht", "1h", "hi");
		WidgetItemMessage message3 = new WidgetItemMessage("avatar.png", "mcNET", "100 Days", "na");
		s2.getItems().add(message);
		s2.getItems().add(message2);
		s2.getItems().add(message3);
		bar.addWidget(s2);

		WidgetUser user = new WidgetUser("avatar.png", "Daniel W.", "Daniel Wieckhorst Professor", "This is my Name");
		user.getButtons().add(new WidgetUserButtonNormal("button1", "#button1"));
		user.getButtons().add(new WidgetUserButtonNormal("button2", "#button2"));
		user.getButtons().add(new WidgetUserButtonNormal("button3", "#button3"));
		user.getButtonsDown().add(new WidgetUserButton("Profile", "#profile", UserButtonPosition.left));
		user.getButtonsDown().add(new WidgetUserButton("LogOut", "#logout", UserButtonPosition.right));

		bar.addWidget(user);

		SideBar sidebar = page.getSideBar();
		MenuCategory cat1 = sidebar.getNewMenuCategory("CAT1");
		Menu m1 = cat1.getNMenu("M1", FontAwesome.YOUTUBE_PLAY);
		MenuItem item1 = m1.getNewMenuItem("Item1", FontAwesome.BOOKMARK, true);
		MenuItem item2 = m1.getNewMenuItem("Item2", FontAwesome.BOOKMARK_O, false);
		MenuItem item3 = m1.getNewMenuItem("Item3", FontAwesome.LEVEL_UP, false);
		MenuItem item4 = m1.getNewMenuItem("Item4", "fa-bookmark", false);
		item4.setLabel("OPEN");
		item4.setLabelColor(BGColor.green);
		item1.setSub(item2);
		item2.setSub(item3);
		item3.setSub(item4);
		item4.setHref("#item4");

		MenuCategory cat2 = sidebar.getNewMenuCategory("Default");
		Menu cat2m1 = cat2.getNMenu("Console", "fa-bell");
		MenuItem mm1 = cat2m1.getNewMenuItem("Test1", "fa-check", true);
		MenuItem mm2 = cat2m1.getNewMenuItem("Test2", "fa-code", true);
		mm1.setHref("http://dawik.de");
		mm2.setHref("http://hostcode.eu");

		Menu cat2m2 = cat2.getNMenu("Console2", "fa-bell");
		cat2m2.setHref("http://tisan.de");
		cat2m2.setLabel("NEW");
		cat2m2.setLabelColor(BGColor.red);

		// Simple Text
		PageBody body = page.getPageBody();
		body.addWebComponent(new SimpleWebComponent() {

			@Override
			public String getHTML() {
				return "Hallo<br>Hi";
			}
		});

		// Box
		body.addWebComponent(new SimpleTestBox("Test1"));

		body.addWebComponent(new WebComponentInfoBox() {

			@Override
			public String getInnerText() {
				return "100/1000";
			}

			@Override
			public String getIcon() {
				return FontAwesome.ALIGN_RIGHT;
			}

			@Override
			public String getHeaderText() {
				return "Messages";
			}

			@Override
			public BGColor getColor() {
				return BGColor.red;
			}
		});
		// Test Progress info Box
		body.addWebComponent(new WebComponentInfoBoxProgress() {

			@Override
			public int getProgress() {
				return 10;
			}

			@Override
			public String getInnerText() {
				return "Inner Text";
			}

			@Override
			public String getIcon() {
				return FontAwesome.ANCHOR;
			}

			@Override
			public String getHeaderText() {
				return "header Text";
			}

			@Override
			public String getDownText() {
				return "down Text";
			}

			@Override
			public BGColor getColor() {
				return BGColor.red;
			}
		});

		// Write to Client
		response.getWriter().append(page.getHTML());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
