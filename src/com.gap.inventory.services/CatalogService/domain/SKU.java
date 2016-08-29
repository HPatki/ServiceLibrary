package com.gap.inventory.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SKU {

	private String id;
	private String skuNumber;
	private String description;
	private double sizeProfilePercentage;
	private List<SKULocation> locations;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSkuNumber() {
		return skuNumber;
	}
	public void setSkuNumber(String skuNumber) {
		this.skuNumber = skuNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getSizeProfilePercentage() {
		return sizeProfilePercentage;
	}
	public void setSizeProfilePercentage(double sizeProfilePercentage) {
		this.sizeProfilePercentage = sizeProfilePercentage;
	}
	public List<SKULocation> getLocations() {
		return locations;
	}
	public void setLocations(List<SKULocation> locations) {
		this.locations = locations;
	}
}
