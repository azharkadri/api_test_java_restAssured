package serializationAndDeserialization;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestMenuJsonPayload {
	
	@Test
	public void testMenuJsonPayload() {
		
		MenuItem menuItemObject=new MenuItem("New", "CreateNewDoc");
		ArrayList<MenuItem> menuItem=new ArrayList<MenuItem>();
		menuItem.add(menuItemObject);
		
		MenuItem menuItemObject2=new MenuItem("Open", "OpenDoc");
		menuItem.add(menuItemObject2);
		
		MenuItem menuItemObject3=new MenuItem("Close", "CloseDoc");
		menuItem.add(menuItemObject3);
		
		Popup popup=new Popup(menuItem);
		
		Menu menu=new Menu("file", "File", popup);
		
		MenuJsonPayload menuJsonPayload=new MenuJsonPayload(menu);
		
		ObjectMapper JsonObjectMapper=new ObjectMapper();
		try {
			String jsonString=JsonObjectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(menuJsonPayload);
			System.out.println("json is : "+jsonString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
