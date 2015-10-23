package myapp;

import java.io.Serializable;

public class Profession implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private String title;
    private String industry;
    private int year;
    
    public int getYear() {
    	return year;
    }
    
    public void setYear() {
    	this.year = year;
    }
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getIndustry() {
        return industry;
    }
 
    public void setIndustry(String industry) {
        this.industry = industry;
    }
}