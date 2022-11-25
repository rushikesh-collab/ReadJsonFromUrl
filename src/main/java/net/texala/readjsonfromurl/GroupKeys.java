package net.texala.readjsonfromurl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.json.JSONObject;
import org.json.JSONArray;

public class GroupKeys 
{
    public static void main( String[] args )
    {
    	String tumblr_api_read = readUrl("https://puppygifs.tumblr.com/api/read/json");
    	tumblr_api_read = tumblr_api_read.replace("var tumblr_api_read = ", "");
    	tumblr_api_read = tumblr_api_read.substring(0, tumblr_api_read.length() - 2);
    	
    	final JSONObject obj = new JSONObject(tumblr_api_read);
    	final JSONArray posts = obj.getJSONArray("posts");
    	
    	List<String> list = new ArrayList<>();
    	
    	for(int i = 0; i < posts.length(); i++) {
    		JSONObject post = posts.getJSONObject(i);  		
    		list.add(post.getString("type"));
    	}    
    	list.stream().forEach(n -> System.out.println(n));
    }

	public static String readUrl(String url) {
		StringBuffer json = new StringBuffer();
		try {
			InputStream input = new URL(url).openStream();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));
			int c;
			while((c = reader.read()) != -1) {
				json.append((char) c);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return json.toString();
	}
	

}
