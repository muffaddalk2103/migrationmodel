/**
 * 
 */
package com.river.meadow.migrationmodel.model;

import java.net.InetAddress;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * @author muffa
 *
 */
public class Workload extends Response {
	@NotNull
	private InetAddress ipAddress;
	@Valid
	private Credentials credentials;
	private List<Volume> storage;
	/**
	 * @return the ipAddress
	 */
	public InetAddress getIpAddress() {
		return ipAddress;
	}
	/**
	 * @param ipAddress the ipAddress to set
	 */
	public void setIpAddress(InetAddress ipAddress) {
		this.ipAddress = ipAddress;
	}
	/**
	 * @return the credentials
	 */
	public Credentials getCredentials() {
		return credentials;
	}
	/**
	 * @param credentials the credentials to set
	 */
	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}
	/**
	 * @return the storage
	 */
	public List<Volume> getStorage() {
		return storage;
	}
	/**
	 * @param storage the storage to set
	 */
	public void setStorage(List<Volume> storage) {
		this.storage = storage;
	}
}
