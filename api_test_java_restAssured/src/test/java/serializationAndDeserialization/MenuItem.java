package serializationAndDeserialization;

public class MenuItem {
	
	private String value;
	private String onClick;
	
	public MenuItem(String value, String onClick) {
		//super();
		this.value = value;
		this.onClick = onClick;
	}
	
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public String getOnClick() {
		return onClick;
	}
	public void setOnClick(String onClick) {
		this.onClick = onClick;
	}
	
}
