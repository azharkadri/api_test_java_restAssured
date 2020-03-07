package marshalling_unmarshalling_jackson_API;

import java.util.ArrayList;
import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test_Json_Payload_1 {
			
	@Test
	public void Test_marshalling_unmarshalling() throws JsonProcessingException {
		
		
		Window window=new Window("Sample Konfabulator Widget","main_window",500,500);
		Image image=new Image("Images/Sun.png", "sun1", 250, 250, "center");
		Text text=new Text("Click Here", 36, "bold", "text1", 250, 100, "center", "sun1.opacity = (sun1.opacity / 100) * 90;");
		ArrayList<Object> glossSeeAlso=new ArrayList<Object>();
		glossSeeAlso.add("HTML");
		glossSeeAlso.add("JSON");
		glossSeeAlso.add("XML");
		
		Widget widget=new Widget("on", window, image, text, glossSeeAlso);
		Json_Payload_1 json_Payload_1=new Json_Payload_1(widget);
		
		// de-serialization : json to pojo
		//json_Payload_1=get("URI").as(Json_Payload_1.class);
			
		// serialization : pojo to json	
		ObjectMapper objectMapper=new ObjectMapper();
		String json_payload=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(json_Payload_1);
		System.out.println("json payload is :"+json_payload);
		
	}

}
