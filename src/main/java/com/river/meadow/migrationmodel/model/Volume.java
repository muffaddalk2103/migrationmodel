/**
 * 
 */
package com.river.meadow.migrationmodel.model;

/**
 * @author muffa
 *
 */
public class Volume {
	private String mountPoint;
	private long volumeSize;
	/**
	 * @return the mountPoint
	 */
	public String getMountPoint() {
		return mountPoint;
	}
	/**
	 * @param mountPoint the mountPoint to set
	 */
	public void setMountPoint(String mountPoint) {
		this.mountPoint = mountPoint;
	}
	/**
	 * @return the volumeSize
	 */
	public long getVolumeSize() {
		return volumeSize;
	}
	/**
	 * @param volumeSize the volumeSize to set
	 */
	public void setVolumeSize(long volumeSize) {
		this.volumeSize = volumeSize;
	}
}
