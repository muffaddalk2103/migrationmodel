/**
 * 
 */
package com.mk.migrationmodel.model;

import javax.validation.constraints.NotEmpty;

/**
 * @author muffa
 *
 */
public class Credentials {
	@NotEmpty(message="{USERNAME_EMPTY}")
	private String userName;
	@NotEmpty
	private String password;
	private String domain;
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the domain
	 */
	public String getDomain() {
		return domain;
	}
	/**
	 * @param domain the domain to set
	 */
	public void setDomain(String domain) {
		this.domain = domain;
	}	
}
