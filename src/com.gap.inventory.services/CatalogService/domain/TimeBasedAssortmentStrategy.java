package com.gap.inventory.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class TimeBasedAssortmentStrategy {
	private String startDate;
	private String endDate;
	private ValueTimeBasedAssortmentStrategy value;
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public ValueTimeBasedAssortmentStrategy getValue() {
		return value;
	}
	public void setValue(ValueTimeBasedAssortmentStrategy value) {
		this.value = value;
	}
}
