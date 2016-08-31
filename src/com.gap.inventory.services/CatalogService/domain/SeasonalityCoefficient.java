package com.gap.inventory.services.CatalogService.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SeasonalityCoefficient {
	private int fiscalWeek;
	private double value;
	public int getFiscalWeek() {
		return fiscalWeek;
	}
	public void setFiscalWeek(int fiscalWeek) {
		this.fiscalWeek = fiscalWeek;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	
}
