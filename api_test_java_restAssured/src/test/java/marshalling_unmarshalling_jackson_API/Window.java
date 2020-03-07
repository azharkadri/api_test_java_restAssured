package marshalling_unmarshalling_jackson_API;

public class Window {
	
	private String title;
	private String name;
	private int width;
	private int height;
	
	Window(String title, String name, int width, int height){
		//super();
		this.title=title;
		this.name=name;
		this.width=width;
		this.height=height;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
