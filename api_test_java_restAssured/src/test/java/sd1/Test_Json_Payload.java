package sd1;

import java.util.ArrayList;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Test_Json_Payload {
	
	@Test
	public void test_Json_Payload() {
		Attributes_Included attributes_Included=new Attributes_Included("John", 80, "male");
		Included included=new Included("people", 42, attributes_Included);
		ArrayList<Included> included_al=new ArrayList<Included>();
		included_al.add(included);
		
		Data_Author data_Author=new Data_Author(42, "people");
		Author author=new Author(data_Author);
		Relationships relationships=new Relationships(author);
		
		Attributes_Data attributes_Data=new Attributes_Data("JSON:API paints my bikeshed!", "The shortest article. Ever.", "2015-05-22T14:56:29.000Z", "2015-05-22T14:56:28.000Z");
		Data data=new Data("articles", 1, attributes_Data, relationships);
		ArrayList<Data> data_al=new ArrayList<Data>();
		data_al.add(data);
		
		Json_Payload json_Payload_Object=new Json_Payload(data_al, included_al);
		
		ObjectMapper objectMapper=new ObjectMapper();
		try {
			String strJson=objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(json_Payload_Object);
			System.out.println("json is : \n"+strJson);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
/*
{
  "data":[
    {
      "type": "articles",
      "id": "1",
      "attributes": {
        "title": "JSON:API paints my bikeshed!",
        "body": "The shortest article. Ever.",
        "created": "2015-05-22T14:56:29.000Z",
        "updated": "2015-05-22T14:56:28.000Z"
      },
      "relationships": {
        "author": {
          "data": {
            "id": "42",
            "type": "people"
          }
        }
      }
    }
  ] ,
  "included": [
    {
      "type": "people",
      "id": "42",
      "attributes": {
        "name": "John",
        "age": 80,
        "gender": "male"
      }
    }
  ]
}
*/
}
