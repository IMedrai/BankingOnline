/**
 * 
 */
package com.bel.models;

/**
 * @author ibrayche
 *
 */
public class User {
	private Long idUser;
	private String nomUser;
	private String prenomUser;
	private String loginUser;
	private String emailUser;
	private String gsmUser;
	private String pwdUser;
	
	
	public String getLoginuser() {
		return loginUser;
	}
	public void setLoginuser(String loginuser) {
		this.loginUser = loginuser;
	}
	public Long getIdUser() {
		return idUser;
	}
	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}
	public String getNomUser() {
		return nomUser;
	}
	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}
	public String getPrenomUser() {
		return prenomUser;
	}
	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}
	public String getEmailUser() {
		return emailUser;
	}
	public void setEmailUser(String emailUser) {
		this.emailUser = emailUser;
	}
	public String getGsmUser() {
		return gsmUser;
	}
	public void setGsmUser(String gsmUser) {
		this.gsmUser = gsmUser;
	}
	public String getPwdUser() {
		return pwdUser;
	}
	public void setPwdUser(String pwdUser) {
		this.pwdUser = pwdUser;
	}
	public User(String login, Long idUser, String nomUser, String prenomUser, String emailUser, String gsmUser, String pwdUser) {
		super();
		this.loginUser = login;
		this.idUser = idUser;
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.emailUser = emailUser;
		this.gsmUser = gsmUser;
		this.pwdUser = pwdUser;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

}
