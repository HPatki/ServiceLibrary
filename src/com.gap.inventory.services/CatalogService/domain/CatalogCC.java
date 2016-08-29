package com.gap.inventory.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class CatalogCC {

	private String id;
	private String plannedCcId;
	private String assortedCcId;
	private String receiptId;
	private String ccNumber;
	private String description;
	private String brandId;	
	private String marketId;
	private String channelId;
	private List<SKU> skus;
	private String styleNumber;
	private String styleDescription;
	private List<MerchandiseHier> merchandiseHierarchy;
	private String inStoreStartDate;
	private String seasonCode;
	private int cyclePeriodDays;
	private int safetyPeriodDays;
	private int visMinLifeCycleDays;
	private double averagePerStore;
	private double visualMinMultiplier;
	private boolean isSizeMinEnforced;
	private List<Distros> distros;
	private List<InSeasonData> inSeasonInputs;
	private String lastUpdatedTimeStamps;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPlannedCcId() {
		return plannedCcId;
	}
	public void setPlannedCcId(String plannedCcId) {
		this.plannedCcId = plannedCcId;
	}
	public String getAssortedCcId() {
		return assortedCcId;
	}
	public void setAssortedCcId(String assortedCcId) {
		this.assortedCcId = assortedCcId;
	}
	public String getReceiptId() {
		return receiptId;
	}
	public void setReceiptId(String receiptId) {
		this.receiptId = receiptId;
	}
	public String getCcNumber() {
		return ccNumber;
	}
	public void setCcNumber(String ccNumber) {
		this.ccNumber = ccNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBrandId() {
		return brandId;
	}
	public void setBrandId(String brandId) {
		this.brandId = brandId;
	}
	public String getMarketId() {
		return marketId;
	}
	public void setMarketId(String marketId) {
		this.marketId = marketId;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public List<SKU> getSkus() {
		return skus;
	}
	public void setSkus(List<SKU> skus) {
		this.skus = skus;
	}
	public String getStyleNumber() {
		return styleNumber;
	}
	public void setStyleNumber(String styleNumber) {
		this.styleNumber = styleNumber;
	}
	public String getStyleDescription() {
		return styleDescription;
	}
	public void setStyleDescription(String styleDescription) {
		this.styleDescription = styleDescription;
	}
	public List<MerchandiseHier> getMerchandiseHierarchy() {
		return merchandiseHierarchy;
	}
	public void setMerchandiseHierarchy(List<MerchandiseHier> merchandiseHierarchy) {
		this.merchandiseHierarchy = merchandiseHierarchy;
	}
	public String getInStoreStartDate() {
		return inStoreStartDate;
	}
	public void setInStoreStartDate(String inStoreStartDate) {
		this.inStoreStartDate = inStoreStartDate;
	}
	public String getSeasonCode() {
		return seasonCode;
	}
	public void setSeasonCode(String seasonCode) {
		this.seasonCode = seasonCode;
	}
	public int getCyclePeriodDays() {
		return cyclePeriodDays;
	}
	public void setCyclePeriodDays(int cyclePeriodDays) {
		this.cyclePeriodDays = cyclePeriodDays;
	}
	public int getSafetyPeriodDays() {
		return safetyPeriodDays;
	}
	public void setSafetyPeriodDays(int safetyPeriodDays) {
		this.safetyPeriodDays = safetyPeriodDays;
	}
	public int getVisMinLifeCycleDays() {
		return visMinLifeCycleDays;
	}
	public void setVisMinLifeCycleDays(int visMinLifeCycleDays) {
		this.visMinLifeCycleDays = visMinLifeCycleDays;
	}
	public double getAveragePerStore() {
		return averagePerStore;
	}
	public void setAveragePerStore(double averagePerStore) {
		this.averagePerStore = averagePerStore;
	}
	public double getVisualMinMultiplier() {
		return visualMinMultiplier;
	}
	public void setVisualMinMultiplier(double visualMinMultiplier) {
		this.visualMinMultiplier = visualMinMultiplier;
	}
	public boolean isSizeMinEnforced() {
		return isSizeMinEnforced;
	}
	public void setSizeMinEnforced(boolean isSizeMinEnforced) {
		this.isSizeMinEnforced = isSizeMinEnforced;
	}
	public List<Distros> getDistros() {
		return distros;
	}
	public void setDistros(List<Distros> distros) {
		this.distros = distros;
	}
	public List<InSeasonData> getInSeasonInputs() {
		return inSeasonInputs;
	}
	public void setInSeasonInputs(List<InSeasonData> inSeasonInputs) {
		this.inSeasonInputs = inSeasonInputs;
	}
	public String getLastUpdatedTimeStamps() {
		return lastUpdatedTimeStamps;
	}
	public void setLastUpdatedTimeStamps(String lastUpdatedTimeStamps) {
		this.lastUpdatedTimeStamps = lastUpdatedTimeStamps;
	}
}
