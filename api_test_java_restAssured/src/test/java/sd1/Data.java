package sd1;

public class Data {
	private String type;
	private int id;
	private Attributes_Data attributes;
	private Relationships relationships;
	
	public Data(String type, int id, Attributes_Data attributes, Relationships relationships) {
		super();
		this.type = type;
		this.id = id;
		this.attributes = attributes;
		this.relationships = relationships;
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
	public Attributes_Data getAttributes() {
		return attributes;
	}
	public void setAttributes(Attributes_Data attributes) {
		this.attributes = attributes;
	}
	public Relationships getRelationships() {
		return relationships;
	}
	public void setRelationships(Relationships relationships) {
		this.relationships = relationships;
	}
				
}
