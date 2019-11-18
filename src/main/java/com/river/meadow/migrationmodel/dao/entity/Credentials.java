/**
 * 
 */
package com.river.meadow.migrationmodel.dao.entity;

import org.springframework.data.cassandra.core.mapping.UserDefinedType;

/**
 * @author muffa
 *
 */
@UserDefinedType("credential_type")
public class Credentials {
	private String userName;
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
