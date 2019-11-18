/**
 * 
 */
package com.river.meadow.migrationmodel.model;

/**
 * @author muffa
 *
 */
public class Response {
	private Messages messages;
	private Boolean success;

	/**
	 * @return the messages
	 */
	public Messages getMessages() {
		return messages;
	}

	/**
	 * @param messages the messages to set
	 */
	public void setMessages(Messages messages) {
		this.messages = messages;
	}

	/**
	 * @return the success
	 */
	public Boolean getSuccess() {
		return success;
	}

	/**
	 * @param success the success to set
	 */
	public void setSuccess(Boolean success) {
		this.success = success;
	}
}
