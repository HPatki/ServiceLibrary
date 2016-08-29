package com.gap.inventory.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DCLocation {

	private String id;
	private String storeNumber;
	private String inStoreStartDate;
	private String inStoreEndDate;
	private int visualMinimumUnits;
	private int safetyPeriodDays;
	private boolean replenFlag;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStoreNumber() {
		return storeNumber;
	}
	public void setStoreNumber(String storeNumber) {
		this.storeNumber = storeNumber;
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
	public int getVisualMinimumUnits() {
		return visualMinimumUnits;
	}
	public void setVisualMinimumUnits(int visualMinimumUnits) {
		this.visualMinimumUnits = visualMinimumUnits;
	}
	public int getSafetyPeriodDays() {
		return safetyPeriodDays;
	}
	public void setSafetyPeriodDays(int safetyPeriodDays) {
		this.safetyPeriodDays = safetyPeriodDays;
	}
	public boolean isReplenFlag() {
		return replenFlag;
	}
	public void setReplenFlag(boolean replenFlag) {
		this.replenFlag = replenFlag;
	}
	
}
