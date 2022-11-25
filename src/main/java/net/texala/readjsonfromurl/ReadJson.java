package net.texala.readjsonfromurl;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.util.JSONPObject;

import net.texala.pojo.Photos;
import net.texala.pojo.Posts;
import net.texala.pojo.Tumblelog;

public class ReadJson {

	public static void main( String[] args ) throws FileNotFoundException, IOException, ParseException {
		ObjectMapper objMap = new ObjectMapper();
		objMap.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		objMap.setVisibility(PropertyAccessor.FIELD,Visibility.ANY);
		
//		List<Photos> ph = objMap.convertValue(objMap.readTree("https://puppygifs.tumblr.com/api/read/json").get("type"), new TypeReference<List<Photos>>() {});
//		Map<Object, List<Photos>> grouping = ph.stream().collect(Collectors.groupingBy(n -> n.caption));
		
//		System.out.println(objMap.readValue(new URL("https://puppygifs.tumblr.com/api/read/json"), Photos.class));
		System.out.println(objMap.readValue(JsonString.jsonString, Tumblelog.class));
        
    }

}
