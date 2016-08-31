package com.gap.inventory.services.CatalogService.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkdownPercentage {
	private double markdownPercent;
	private int weeksToApplyMarkdownPercentage;
	private int orderPlacement;
	public double getMarkdownPercent() {
		return markdownPercent;
	}
	public void setMarkdownPercent(double markdownPercent) {
		this.markdownPercent = markdownPercent;
	}
	public int getWeeksToApplyMarkdownPercentage() {
		return weeksToApplyMarkdownPercentage;
	}
	public void setWeeksToApplyMarkdownPercentage(int weeksToApplyMarkdownPercentage) {
		this.weeksToApplyMarkdownPercentage = weeksToApplyMarkdownPercentage;
	}
	public int getOrderPlacement() {
		return orderPlacement;
	}
	public void setOrderPlacement(int orderPlacement) {
		this.orderPlacement = orderPlacement;
	}
}
