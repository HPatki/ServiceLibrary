package com.gap.inventory.domain;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdvancedTicketPrice {
	private String defaultEconomicRegion;
	private List<EconomicRegions> economicRegions;
	public String getDefaultEconomicRegion() {
		return defaultEconomicRegion;
	}
	public void setDefaultEconomicRegion(String defaultEconomicRegion) {
		this.defaultEconomicRegion = defaultEconomicRegion;
	}
	public List<EconomicRegions> getEconomicRegions() {
		return economicRegions;
	}
	public void setEconomicRegions(List<EconomicRegions> economicRegions) {
		this.economicRegions = economicRegions;
	}
}
