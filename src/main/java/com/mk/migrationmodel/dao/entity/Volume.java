/**
 * 
 */
package com.mk.migrationmodel.dao.entity;

import org.springframework.data.cassandra.core.mapping.UserDefinedType;

/**
 * @author muffa
 *
 */
@UserDefinedType("volume_type")
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
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((mountPoint == null) ? 0 : mountPoint.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Volume other = (Volume) obj;
		if (mountPoint == null) {
			if (other.mountPoint != null)
				return false;
		} else if (!mountPoint.equals(other.mountPoint))
			return false;
		return true;
	}
}
