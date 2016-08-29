package com.gap.inventory.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DistributionCenter {

	private String id;
	private String dcNumber;
	private String dcCode;
	private String inStoreStartDate;
	private String inStoreEndDate;
	private boolean releaseFlag;
	private int timeOnOfferDays;
	private List<DCLocation> locations;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDcNumber() {
		return dcNumber;
	}
	public void setDcNumber(String dcNumber) {
		this.dcNumber = dcNumber;
	}
	public String getDcCode() {
		return dcCode;
	}
	public void setDcCode(String dcCode) {
		this.dcCode = dcCode;
	}
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
	public int getTimeOnOfferDays() {
		return timeOnOfferDays;
	}
	public void setTimeOnOfferDays(int timeOnOfferDays) {
		this.timeOnOfferDays = timeOnOfferDays;
	}
	public List<DCLocation> getLocations() {
		return locations;
	}
	public void setLocations(List<DCLocation> locations) {
		this.locations = locations;
	}
}
