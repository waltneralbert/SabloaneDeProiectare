package Carte;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONBuilder implements Builder{

	private String fileName;
	private Element doc=null;
	
	public JSONBuilder(String fileName) {
		this.fileName = fileName;
	}
	
	@Override
	public void build() {
		ObjectMapper mapper = new ObjectMapper();
		File jsonFile = new File(fileName);
		
		try {
			HashMap<String, Object> map = mapper.readValue(jsonFile, HashMap.class);
			System.out.println(map.values());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public Element processMap(HashMap<String, Object> map) {
		String elClass = (String) map.get("class");
		if(elClass.equals("Section")) {
			return buildSectiune(map);
		}
		
		return null;
	}
	
	public Element buildSectiune(HashMap<String, Object> map) {
		Sectiune s = new Sectiune((String) map.get("title"));
		
		Collection<HashMap<String, Object>> children = (Collection<HashMap<String, Object>>) map.get("children");
		
		children.forEach(null);
		return s;
	}

	@Override
	public Element getResult() {
		return doc;
	}

}
