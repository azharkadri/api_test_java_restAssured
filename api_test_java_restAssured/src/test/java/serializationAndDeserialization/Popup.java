package serializationAndDeserialization;

import java.util.ArrayList;

public class Popup {
	private ArrayList<MenuItem> menuItem=new ArrayList<MenuItem>();

	public Popup(ArrayList<MenuItem> menuItem) {
		//super();
		this.menuItem = menuItem;
	}

	public ArrayList<MenuItem> getMenuItem() {
		return menuItem;
	}

	public void setMenuItem(ArrayList<MenuItem> menuItem) {
		this.menuItem = menuItem;
	}	

}
