package com.gap.inventory.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class StoreList {
	private String id;
	private boolean isTimeBased;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isTimeBased() {
		return isTimeBased;
	}
	public void setTimeBased(boolean isTimeBased) {
		this.isTimeBased = isTimeBased;
	}
	
}
