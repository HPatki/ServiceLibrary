package com.gap.inventory.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class AssortmentStrategy {
	private String id;
	private String name;
	private StoreList storeList;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public StoreList getStoreList() {
		return storeList;
	}
	public void setStoreList(StoreList storeList) {
		this.storeList = storeList;
	}
}
