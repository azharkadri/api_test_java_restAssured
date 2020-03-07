package serializationAndDeserialization;

public class MenuJsonPayload {
	
	private Menu menu;

	public MenuJsonPayload(Menu menu) {
		//super();
		this.menu = menu;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	
		
}
