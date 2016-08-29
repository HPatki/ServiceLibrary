package com.gap.inventory.domain;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class EconomicRegions {
	private String name;
	private List<TimeBasedValue> timeBasedValues;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<TimeBasedValue> getTimeBasedValues() {
		return timeBasedValues;
	}
	public void setTimeBasedValues(List<TimeBasedValue> timeBasedValues) {
		this.timeBasedValues = timeBasedValues;
	} 
}
