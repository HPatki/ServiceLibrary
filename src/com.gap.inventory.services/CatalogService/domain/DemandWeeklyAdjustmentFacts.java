package com.gap.inventory.domain;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DemandWeeklyAdjustmentFacts {
	private List<DemandMultipliers> demandMultipliers;
	private List<PriceMultipliers> priceMultipliers;
	private List<InventoryRestatement> inventoryRestatement;
	private List<PriceEventManagementDiscountPercentages> priceEventManagementDiscountPercentages;
	public List<DemandMultipliers> getDemandMultipliers() {
		return demandMultipliers;
	}
	public void setDemandMultipliers(List<DemandMultipliers> demandMultipliers) {
		this.demandMultipliers = demandMultipliers;
	}
	public List<PriceMultipliers> getPriceMultipliers() {
		return priceMultipliers;
	}
	public void setPriceMultipliers(List<PriceMultipliers> priceMultipliers) {
		this.priceMultipliers = priceMultipliers;
	}
	public List<InventoryRestatement> getInventoryRestatement() {
		return inventoryRestatement;
	}
	public void setInventoryRestatement(
			List<InventoryRestatement> inventoryRestatement) {
		this.inventoryRestatement = inventoryRestatement;
	}
	public List<PriceEventManagementDiscountPercentages> getPriceEventManagementDiscountPercentages() {
		return priceEventManagementDiscountPercentages;
	}
	public void setPriceEventManagementDiscountPercentages(
			List<PriceEventManagementDiscountPercentages> priceEventManagementDiscountPercentages) {
		this.priceEventManagementDiscountPercentages = priceEventManagementDiscountPercentages;
	}
}
