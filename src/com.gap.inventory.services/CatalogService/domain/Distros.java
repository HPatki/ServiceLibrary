package com.gap.inventory.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Distros {

	private String id;
	private String distroName;
	private String inStoreStartDate;
	private String inStoreEndDate;
	private boolean releaseFlag;
	private List<DistributionCenter> distributionCenters;
	
	public String getInStoreStartDate() {
		return inStoreStartDate;
	}
	public void setInStoreStartDate(String inStoreStartDate) {
		this.inStoreStartDate = inStoreStartDate;
	}
	public String getInStoreEndDate() {
		return inStoreEndDate;
	}
	public void setInStoreEndDate(String inStoreEndDate) {
		this.inStoreEndDate = inStoreEndDate;
	}
	public boolean isReleaseFlag() {
		return releaseFlag;
	}
	public void setReleaseFlag(boolean releaseFlag) {
		this.releaseFlag = releaseFlag;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDistroName() {
		return distroName;
	}
	public void setDistroName(String distroName) {
		this.distroName = distroName;
	}
	public List<DistributionCenter> getDistributionCenters() {
		return distributionCenters;
	}
	public void setDistributionCenters(List<DistributionCenter> distributionCenters) {
		this.distributionCenters = distributionCenters;
	}
}