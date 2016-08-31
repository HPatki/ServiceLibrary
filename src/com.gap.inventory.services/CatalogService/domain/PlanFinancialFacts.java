package com.gap.inventory.services.CatalogService.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlanFinancialFacts {
	private AdvancedTicketPrice advancedTicketPrice;
	private ValueAddedTax valueAddedTax;
	public AdvancedTicketPrice getAdvancedTicketPrice() {
		return advancedTicketPrice;
	}
	public void setAdvancedTicketPrice(AdvancedTicketPrice advancedTicketPrice) {
		this.advancedTicketPrice = advancedTicketPrice;
	}
	public ValueAddedTax getValueAddedTax() {
		return valueAddedTax;
	}
	public void setValueAddedTax(ValueAddedTax valueAddedTax) {
		this.valueAddedTax = valueAddedTax;
	} 
}
