package sd1;

import java.util.ArrayList;

public class Json_Payload {
	
	private ArrayList<Data> data;
	private ArrayList<Included> included;
	
	public Json_Payload(ArrayList<Data> data, ArrayList<Included> included) {
		super();
		this.data = data;
		this.included = included;
	}
	public ArrayList<Data> getData() {
		return data;
	}
	public void setData(ArrayList<Data> data) {
		this.data = data;
	}
	public ArrayList<Included> getIncluded() {
		return included;
	}
	public void setIncluded(ArrayList<Included> included) {
		this.included = included;
	}
	
}
