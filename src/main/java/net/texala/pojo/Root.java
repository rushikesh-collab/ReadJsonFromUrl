package net.texala.pojo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Root {
	 	public Tumblelog tumblelog;
	    public int postsStart;
	    public int postsTotal;
	    public boolean postsType;
	    public ArrayList<Posts> posts;
}
