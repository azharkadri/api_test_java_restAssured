package sd1;

public class Attributes_Data {
	private String title;
	private String body;
	private String created;
	private String updated;
	
	public Attributes_Data(String title, String body, String created, String updated) {
		//super();
		this.title = title;
		this.body = body;
		this.created = created;
		this.updated = updated;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public String getUpdated() {
		return updated;
	}

	public void setUpdated(String updated) {
		this.updated = updated;
	}
	
}
