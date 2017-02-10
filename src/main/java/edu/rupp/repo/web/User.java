package edu.rupp.repo.web;

import java.util.Date;

public class User {
	private long id;
	private String email;
	private String password;
    private Date createdDate = new Date();
    private String urlPhoto;

    public User(Integer id, String email, String password, Date createdDate, String urlPhoto) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.createdDate = createdDate;
        this.urlPhoto = urlPhoto;
     }
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }
    
    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param id the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param id the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the createdDate
     */
    public Date getCreatedDate() {
        return createdDate;
    }

    /**
     * @param createdBy the createdDate to set
     */
    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
    
    /**
     * @return the urlPhoto
     */
    public String getUrlPhoto() {
        return urlPhoto;
    }

    /**
     * @param id the urlPhoto to set
     */
    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

	public void setLastName(String string) {
		// TODO Auto-generated method stub
		
	}
}
