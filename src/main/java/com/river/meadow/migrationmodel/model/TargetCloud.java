/**
 * 
 */
package com.river.meadow.migrationmodel.model;

/**
 * @author muffa
 *
 */
public class TargetCloud {

	private SupportedCloudTypes cloudType;
	private Credentials cloudCredentials;
	private Workload target;
	/**
	 * @return the cloudType
	 */
	public SupportedCloudTypes getCloudType() {
		return cloudType;
	}
	/**
	 * @param cloudType the cloudType to set
	 */
	public void setCloudType(SupportedCloudTypes cloudType) {
		this.cloudType = cloudType;
	}
	/**
	 * @return the cloudCredentials
	 */
	public Credentials getCloudCredentials() {
		return cloudCredentials;
	}
	/**
	 * @param cloudCredentials the cloudCredentials to set
	 */
	public void setCloudCredentials(Credentials cloudCredentials) {
		this.cloudCredentials = cloudCredentials;
	}
	/**
	 * @return the target
	 */
	public Workload getTarget() {
		return target;
	}
	/**
	 * @param target the target to set
	 */
	public void setTarget(Workload target) {
		this.target = target;
	}
}
