package com.gap.inventory.domain;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class RollingDistro {
	private List<TimeBasedAssortmentStrategy> timeBasedAssortmentStrategies;
	private StoreList storeList;
	public List<TimeBasedAssortmentStrategy> getTimeBasedAssortmentStrategies() {
		return timeBasedAssortmentStrategies;
	}
	public void setTimeBasedAssortmentStrategies(
			List<TimeBasedAssortmentStrategy> timeBasedAssortmentStrategies) {
		this.timeBasedAssortmentStrategies = timeBasedAssortmentStrategies;
	}
	public StoreList getStoreList() {
		return storeList;
	}
	public void setStoreList(StoreList storeList) {
		this.storeList = storeList;
	}
}
