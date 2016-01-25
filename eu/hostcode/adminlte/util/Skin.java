package eu.hostcode.adminlte.util;

public enum Skin {
	skin_blue("skin-blue"), skin_blue_light("skin-blue-light"), skin_yellow("skin-yellow"), skin_yellow_light("skin-yellow-light"), skin_green("skin-green"), skin_green_light("skin-green-light"), skin_purple("skin-purple"), skin_purple_light("skin-purple-light"), skin_red("skin-red"), skin_red_light("skin-red-light"), skin_black("skin-black"), skin_black_light("skin-black-light");

	private String name;

	private Skin(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
