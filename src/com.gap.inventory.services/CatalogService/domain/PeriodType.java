package com.gap.inventory.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class PeriodType {
	private int fiscalYear;
	private int fiscalWeek;
	public int getFiscalYear() {
		return fiscalYear;
	}
	public void setFiscalYear(int fiscalYear) {
		this.fiscalYear = fiscalYear;
	}
	public int getFiscalWeek() {
		return fiscalWeek;
	}
	public void setFiscalWeek(int fiscalWeek) {
		this.fiscalWeek = fiscalWeek;
	}
}
