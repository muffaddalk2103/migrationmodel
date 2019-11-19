/**
 * 
 */
package com.mk.migrationmodel.dao.entity;

import java.util.List;

/**
 * @author muffa
 *
 */
public class Target {
	private String ipAddress;
	private String userName;
	private String password;
	private String domain;
	private String cloudType;
	private List<String> storage;
	/**
	 * @return the ipAddress
	 */
	public String getIpAddress() {
		return ipAddress;
	}
	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	/**
	 * @return the storage
	 */
	public List<String> getStorage() {
		return storage;
	}
	/**
	 * @param storage the storage to set
	 */
	public void setStorage(List<String> storage) {
		this.storage = storage;
	}
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
	/**
	 * @return the cloudType
	 */
	public String getCloudType() {
		return cloudType;
	}
	/**
	 * @param cloudType the cloudType to set
	 */
	public void setCloudType(String cloudType) {
		this.cloudType = cloudType;
	}
}
