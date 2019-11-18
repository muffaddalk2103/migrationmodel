/**
 * 
 */
package com.river.meadow.migrationmodel.model;

import java.util.List;

/**
 * @author muffa
 *
 */
public class Migration {

	private List<String> mountPoints;
	private Workload source;
	private TargetCloud targetCloud;
	private MigrationState migrationState;
	/**
	 * @return the mountPoints
	 */
	public List<String> getMountPoints() {
		return mountPoints;
	}
	/**
	 * @param mountPoints the mountPoints to set
	 */
	public void setMountPoints(List<String> mountPoints) {
		this.mountPoints = mountPoints;
	}
	/**
	 * @return the source
	 */
	public Workload getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(Workload source) {
		this.source = source;
	}
	/**
	 * @return the targetCloud
	 */
	public TargetCloud getTargetCloud() {
		return targetCloud;
	}
	/**
	 * @param targetCloud the targetCloud to set
	 */
	public void setTargetCloud(TargetCloud targetCloud) {
		this.targetCloud = targetCloud;
	}
	/**
	 * @return the migrationState
	 */
	public MigrationState getMigrationState() {
		return migrationState;
	}
	/**
	 * @param migrationState the migrationState to set
	 */
	public void setMigrationState(MigrationState migrationState) {
		this.migrationState = migrationState;
	}
}
