package net.texala.pojo;

import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Posts {
	 	public String id;
	    public String url;
	    public String urlWithSlug;
	    public String type;
	    public String dateGmt;
	    public String date;
	    public int bookmarklet;
	    public int mobile;
	    public String feedItem;
	    public int fromfeedid;
	    public int unixTimestamp;
	    public String format;
	    public String reblogKey;
	    public String slug;
	    public boolean isSubmission;
	    public String likeButton;
	    public String reblogButton;
	    public String noteCount;
	    public Tumblelog tumblelog;
	    public String photoCaption;
	    public int width;
	    public int height;
	    public String photoUrl1280;
	    public String photoUrl500;
	    public String photoUrl400;
	    public String photoUrl250;
	    public String photoUrl100;
	    public String photoUrl75;
	    public ArrayList<Photos> photos;
	    public ArrayList<String> tags;
	    public String regularTitle;
	    public String regularBody;
}
