package com.gap.inventory.services.CatalogService.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Elasticities {
	private double percentageDiscount;
	private double lift;
	public double getPercentageDiscount() {
		return percentageDiscount;
	}
	public void setPercentageDiscount(double percentageDiscount) {
		this.percentageDiscount = percentageDiscount;
	}
	public double getLift() {
		return lift;
	}
	public void setLift(double lift) {
		this.lift = lift;
	}
}
