package net.texala.pojo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Tumblelog {
	 	public String title;
	    public String description;
	    public String name;
	    public String timezone;
	    public boolean cname;
	    public ArrayList<Object> feeds;
	    public String url;
	    public String avatar_url_512;
	    public String avatar_url_128;
	    public String avatar_url_96;
	    public String avatar_url_64;
	    public String avatar_url_48;
	    public String avatar_url_40;
	    public String avatar_url_30;
	    public String avatar_url_24;
	    public String avatar_url_16;
}
