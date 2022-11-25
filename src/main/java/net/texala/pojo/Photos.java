package net.texala.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Photos {
	  	public String offset;
	    public String caption;
	    public int width;
	    public int height;
	    public String photoUrl1280;
	    public String photoUrl500;
	    public String photoUrl400;
	    public String photoUrl250;
	    public String photoUrl100;
	    public String photoUrl75;
}
