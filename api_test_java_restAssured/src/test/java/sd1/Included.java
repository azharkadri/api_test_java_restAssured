package sd1;

public class Included {
	private String type;
	private int id;
	private Attributes_Included attributes;
	
	public Included(String type, int id, Attributes_Included attributes) {
		//super();
		this.type = type;
		this.id = id;
		this.attributes = attributes;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Attributes_Included getAttributes() {
		return attributes;
	}
	public void setAttributes(Attributes_Included attributes) {
		this.attributes = attributes;
	}
	
}
