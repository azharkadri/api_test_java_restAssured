package marshalling_unmarshalling_jackson_API;

import java.util.ArrayList;

public class Widget {
	private String debug;
	Window window;
	Image image;
	Text text;
	private ArrayList<Object> glossSeeAlso;
	
	public Widget(String debug, Window window, Image image, Text text, ArrayList<Object> glossSeeAlso) {
		//super();
		this.debug = debug;
		this.window = window;
		this.image = image;
		this.text = text;
		this.glossSeeAlso = glossSeeAlso;
	}

	public String getDebug() {
		return debug;
	}

	public void setDebug(String debug) {
		this.debug = debug;
	}

	public Window getWindow() {
		return window;
	}

	public void setWindow(Window window) {
		this.window = window;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	public Text getText() {
		return text;
	}

	public void setText(Text text) {
		this.text = text;
	}

	public ArrayList<Object> getGlossSeeAlso() {
		return glossSeeAlso;
	}

	public void setGlossSeeAlso(ArrayList<Object> glossSeeAlso) {
		this.glossSeeAlso = glossSeeAlso;
	}
	
		
}
