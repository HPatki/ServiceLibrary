package com.gap.inventory.domain;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class InSeasonData {
	private Period period;
	private int version;
	private DemandProjectionFacts demandProjectionFacts;
	private ReceiptRecommendationFacts receiptRecommendationFacts;
	private DemandWeeklyAdjustmentFacts demandWeeklyAdjustmentFacts;
	private String createdOn;
	private String createdBy;
	private String projectorVersion;
	public Period getPeriod() {
		return period;
	}
	public void setPeriod(Period period) {
		this.period = period;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public DemandProjectionFacts getDemandProjectionFacts() {
		return demandProjectionFacts;
	}
	public void setDemandProjectionFacts(DemandProjectionFacts demandProjectionFacts) {
		this.demandProjectionFacts = demandProjectionFacts;
	}
	public ReceiptRecommendationFacts getReceiptRecommendationFacts() {
		return receiptRecommendationFacts;
	}
	public void setReceiptRecommendationFacts(
			ReceiptRecommendationFacts receiptRecommendationFacts) {
		this.receiptRecommendationFacts = receiptRecommendationFacts;
	}
	public DemandWeeklyAdjustmentFacts getDemandWeeklyAdjustmentFacts() {
		return demandWeeklyAdjustmentFacts;
	}
	public void setDemandWeeklyAdjustmentFacts(
			DemandWeeklyAdjustmentFacts demandWeeklyAdjustmentFacts) {
		this.demandWeeklyAdjustmentFacts = demandWeeklyAdjustmentFacts;
	}
	public String getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(String createdOn) {
		this.createdOn = createdOn;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getProjectorVersion() {
		return projectorVersion;
	}
	public void setProjectorVersion(String projectorVersion) {
		this.projectorVersion = projectorVersion;
	}
}
