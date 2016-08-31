package com.gap.inventory.services.CatalogService.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class VisualMinimumConfiguration {
	private String rounding;
	private String arbitration;
	private int multiplier;
	private int numberOfDays;
	private boolean isOneUnitPerSizeEnforced;
	public String getRounding() {
		return rounding;
	}
	public void setRounding(String rounding) {
		this.rounding = rounding;
	}
	public String getArbitration() {
		return arbitration;
	}
	public void setArbitration(String arbitration) {
		this.arbitration = arbitration;
	}
	public int getMultiplier() {
		return multiplier;
	}
	public void setMultiplier(int multiplier) {
		this.multiplier = multiplier;
	}
	public int getNumberOfDays() {
		return numberOfDays;
	}
	public void setNumberOfDays(int numberOfDays) {
		this.numberOfDays = numberOfDays;
	}
	public boolean isOneUnitPerSizeEnforced() {
		return isOneUnitPerSizeEnforced;
	}
	public void setOneUnitPerSizeEnforced(boolean isOneUnitPerSizeEnforced) {
		this.isOneUnitPerSizeEnforced = isOneUnitPerSizeEnforced;
	}
}
