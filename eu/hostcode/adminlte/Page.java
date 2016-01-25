package eu.hostcode.adminlte;

import java.util.ArrayList;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import eu.hostcode.adminlte.nav.NavigationBar;
import eu.hostcode.adminlte.sideBar.menu.SideBar;
import eu.hostcode.adminlte.util.HTMLAble;
import eu.hostcode.adminlte.util.Skin;

public class Page implements HTMLAble {
	private String title;
	private String smallTitle;
	private String largeTitle = "TestPage";
	private String logoLink = "#a";

	private String footer = "Your footer here <a href=\"#FOOTER_CLICK\">With links</a>";
	private String footerRight = "<b>Version</b> 0.0.0.1";

	private ArrayList<String> endScripts;
	private ArrayList<String> header;
	private Skin skin;

	private NavigationBar nav;
	private SideBar sideBar;
	private PageBody body;

	private ServletResponse response;
	private ServletRequest request;

	public Page(String title, ServletRequest request, ServletResponse response) {
		this.header = new ArrayList<>();
		this.title = title;
		this.request = request;
		this.response = response;
		this.endScripts = new ArrayList<>();
		endScripts.add("<script src=\"" + request.getServletContext().getContextPath() + "/plugins/jQuery/jQuery-2.1.4.min.js\"></script>\n");
		endScripts.add("<script src=\"" + request.getServletContext().getContextPath() + "/bootstrap/js/bootstrap.min.js\"></script>\n");
		endScripts.add("<script src=\"" + request.getServletContext().getContextPath() + "/dist/js/app.min.js\"></script>\n");
		endScripts.add("<script src=\"" + request.getServletContext().getContextPath() + "/plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
		endScripts.add("<script src=\"" + request.getServletContext().getContextPath() + "/plugins/fastclick/fastclick.js\"></script>\n");
		endScripts.add("<script src=\"" + request.getServletContext().getContextPath() + "/plugins/sparkline/jquery.sparkline.min.js\"></script>\n");
		endScripts.add("<script src=\"" + request.getServletContext().getContextPath() + "/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\"></script>\n");
		endScripts.add("<script src=\"" + request.getServletContext().getContextPath() + "/plugins/jvectormap/jquery-jvectormap-world-mill-en.js\"></script>\n");
		endScripts.add("<script src=\"" + request.getServletContext().getContextPath() + "/plugins/slimScroll/jquery.slimscroll.min.js\"></script>\n");
		endScripts.add("<script src=\"" + request.getServletContext().getContextPath() + "/plugins/chartjs/Chart.min.js\"></script>\n");

		header.add("<meta charset=\"utf-8\">");
		header.add("<meta content=\"width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no\" name=\"viewport\">");
		header.add("<link rel=\"stylesheet\" href=\"" + request.getServletContext().getContextPath() + "/bootstrap/css/bootstrap.min.css\">");
		header.add("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.4.0/css/font-awesome.min.css\">");
		header.add("<link rel=\"stylesheet\" href=\"https://code.ionicframework.com/ionicons/2.0.1/css/ionicons.min.css\">");
		header.add("<link rel=\"stylesheet\" href=\"" + request.getServletContext().getContextPath() + "/plugins/jvectormap/jquery-jvectormap-1.2.2.css\">");
		header.add("<link rel=\"stylesheet\" href=\"" + request.getServletContext().getContextPath() + "/dist/css/AdminLTE.min.css\">");
		header.add("<link rel=\"stylesheet\" href=\"" + request.getServletContext().getContextPath() + "/dist/css/skins/_all-skins.min.css\">");
		header.add("<link rel=\"stylesheet\" href=\"" + request.getServletContext().getContextPath() + "/plugins/jQuery/jQuery-2.1.4.min.js\">");
		header.add("<link rel=\"stylesheet\" href=\"" + request.getServletContext().getContextPath() + "/bootstrap/js/bootstrap.min.js\">");
		header.add("<link rel=\"stylesheet\" href=\"" + request.getServletContext().getContextPath() + "/plugins/fastclick/fastclick.js\">");
		header.add("<link rel=\"stylesheet\" href=\"" + request.getServletContext().getContextPath() + "/dist/js/app.min.js\">");
		header.add("<link rel=\"stylesheet\" href=\"" + request.getServletContext().getContextPath() + "/plugins/sparkline/jquery.sparkline.min.js\">");
		header.add("<link rel=\"stylesheet\" href=\"" + request.getServletContext().getContextPath() + "/plugins/jvectormap/jquery-jvectormap-1.2.2.min.js\">");
		header.add("<link rel=\"stylesheet\" href=\"" + request.getServletContext().getContextPath() + "/plugins/jvectormap/jquery-jvectormap-world-mill-en.js\">");
		header.add("<link rel=\"stylesheet\" href=\"" + request.getServletContext().getContextPath() + "/plugins/slimScroll/jquery.slimscroll.min.js\">");
		header.add("<link rel=\"stylesheet\" href=\"" + request.getServletContext().getContextPath() + "/plugins/chartjs/Chart.min.js\">");
		header.add("<!--[if lt IE 9]>");
		header.add("<script src=\"https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js\"></script>");
		header.add("<script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>");
		header.add("<![endif]-->");
	}

	public String getTitle() {
		return title;
	}

	public NavigationBar getNavigationBar() {
		if (nav == null) {
			nav = new NavigationBar();
			return nav;
		} else {
			return nav;
		}
	}

	public SideBar getSideBar() {
		if (sideBar == null) {
			sideBar = new SideBar();
			return sideBar;
		} else {
			return sideBar;
		}
	}

	public PageBody getPageBody() {
		if (body == null) {
			body = new PageBody();
			return body;
		} else {
			return body;
		}
	}

	@Override
	public String getHTML() {
		// if (!isReady()) {
		// return "Error check ALL components";
		// }
		String h = "<!DOCTYPE html>\n";
		h += "<html>\n";
		h += "<head>\n";
		h += "<title>" + title + "</title>\n";
		for (String s : header) {
			h += s + "\n";
		}
		h += "</head>\n";
		h += "<body class=\"hold-transition " + skin.getName() + " sidebar-mini\">\n";
		h += "<div class=\"wrapper\">\n";

		h += "<header class=\"main-header\">\n";
		h += "<a href=\"" + logoLink + "\" class=\"logo\">\n";
		h += "<span class=\"logo-mini\"><b>" + smallTitle + "</b></span>\n";
		h += "<span class=\"logo-lg\">" + largeTitle + "</span>\n";
		h += "</a>\n";
		h += getNavigationBar().getHTML(); // </header>
		h += getSideBar().getHTML();
		h += getPageBody().getHTML();

		h += "<footer class=\"main-footer\"><div class=\"pull-right hidden-xs\">" + footerRight + "</div>" + footer + "</footer>";
		h += "</div>\n";
		for (String sc : endScripts) {
			h += sc;
		}
		h += "</body>\n";
		h += "</html>\n";
		h += "";
		h += "";
		h += "";
		h += "";
		h += "";
		h += "";

		return h;
	}

	@Override
	public boolean isReady() {
		boolean b = true;
		if (nav == null || !nav.isReady()) {
			b = false;
		}
		if (body == null || !body.isReady()) {
			b = false;
		}
		if (sideBar == null || !sideBar.isReady()) {
			b = false;
		}
		return b;
	}

	public ArrayList<String> getHeader() {
		return header;
	}

	public void setHeader(ArrayList<String> header) {
		this.header = header;
	}

	public Skin getSkin() {
		return skin;
	}

	public String getFooter() {
		return footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	public String getFooterRight() {
		return footerRight;
	}

	public void setFooterRight(String footerRight) {
		this.footerRight = footerRight;
	}

	public ArrayList<String> getEndScripts() {
		return endScripts;
	}

	public void setEndScripts(ArrayList<String> endScripts) {
		this.endScripts = endScripts;
	}

	public void setSkin(Skin skin) {
		this.skin = skin;
	}

	public void setBody(PageBody body) {
		this.body = body;
	}

	public ServletResponse getResponse() {
		return response;
	}

	public void setResponse(ServletResponse response) {
		this.response = response;
	}

	public ServletRequest getRequest() {
		return request;
	}

	public void setRequest(ServletRequest request) {
		this.request = request;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSmallTitle() {
		return smallTitle;
	}

	public void setSmallTitle(String smallTitle) {
		this.smallTitle = smallTitle;
	}

	public String getLargeTitle() {
		return largeTitle;
	}

	public void setLargeTitle(String largeTitle) {
		this.largeTitle = largeTitle;
	}

	public void setNav(NavigationBar nav) {
		this.nav = nav;
	}

	public String getLogoLink() {
		return logoLink;
	}

	public void setLogoLink(String logoLink) {
		this.logoLink = logoLink;
	}

	public void setSideBar(SideBar sideBar) {
		this.sideBar = sideBar;
	}

}
