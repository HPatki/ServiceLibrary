package com.gap.inventory.services.CatalogService.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)

public class SKULocation {
	
	private String id;
	private int visualMinimumUnits;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getVisualMinimumUnits() {
		return visualMinimumUnits;
	}
	public void setVisualMinimumUnits(int visualMinimumUnits) {
		this.visualMinimumUnits = visualMinimumUnits;
	}
	
}
