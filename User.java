package myapp;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class User implements Serializable {

	private static final long serialVersionUID = 1L;

//	@ManagedProperty(value="Alby")
	  private String name;
    private String password;

    private String surname;

    private List<String> favoriteSports;
    private Map<String, String> spokenLanguages;

    private Profession profession;


    public String login(){
    	return "welcome";
    }

    public String beverages(){
    	return "beverages";
    }


    public String survey(){
    	return "input";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("Bean is initialized with the following user name: " + name);
    }
    @PreDestroy
    private void cleanUp() {
        System.out.println("You can do the cleanup here");
    }

	public List<String> getFavoriteSports() {
		return favoriteSports;
	}

	public void setFavoriteSports(List<String> favoriteSports) {
		this.favoriteSports = favoriteSports;
	}

	public Map<String, String> getSpokenLanguages() {
		return spokenLanguages;
	}

	public void setSpokenLanguages(Map<String, String> spokenLanguages) {
		this.spokenLanguages = spokenLanguages;
	}

	public Profession getProfession() {
		return profession;
	}

	public void setProfession(Profession profession) {
		this.profession = profession;
	}
}
