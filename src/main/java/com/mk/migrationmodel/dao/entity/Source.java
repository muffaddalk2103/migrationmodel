/**
 * 
 */
package com.mk.migrationmodel.dao.entity;

import java.net.InetAddress;
import java.util.Set;

import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import com.datastax.driver.core.DataType;

/**
 * @author muffa
 *
 */
@Table
public class Source {
	@PrimaryKey
	@CassandraType(type=DataType.Name.INET)
	private InetAddress ipAddress;
	@CassandraType(type = DataType.Name.UDT, userTypeName = "credential_type") 
	private Credentials credentials;
	@Column("volumes")
	private Set<Volume> volumes;
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
	 * @return the volumes
	 */
	public Set<Volume> getVolumes() {
		return volumes;
	}
	/**
	 * @param volumes the volumes to set
	 */
	public void setVolumes(Set<Volume> volumes) {
		this.volumes = volumes;
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
}
