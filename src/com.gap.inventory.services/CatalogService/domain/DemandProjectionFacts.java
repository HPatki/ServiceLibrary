package com.gap.inventory.services.CatalogService.domain;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class DemandProjectionFacts {
	private int userDefinedBuyQuantity;
	private int weeksAtRegularPrice;
	private double averageUnitRetailShave;
	private double averagePerStore;
	private boolean isAveragePerStoreOverridden;
	private double regularSellThroughPercent;
	private String plannedInStoreDate;
	private List<MarkdownPercentage> markdownPercentages;
	private TicketPrice ticketPrice;
	private PlanFinancialFacts planFinancialFacts;
	private List<SeasonalityCoefficient> seasonalityCoefficients;
	private List<Elasticities> elasticities;
	private int inDistributionCenterToInStoreWindow;
	private SizeProfile sizeProfile;
	private SizeRange sizeRange;
	private boolean isManuallySized;
	private boolean isAutoSized;
	private StoreDeviations storeDeviations;
	private AssortmentStrategy assortmentStrategy;
	private RollingDistro rollingDistro;
	private String markdownDate;
	private List<LocationBasedSeasonalities> locationBasedSeasonalities;
	public int getUserDefinedBuyQuantity() {
		return userDefinedBuyQuantity;
	}
	public void setUserDefinedBuyQuantity(int userDefinedBuyQuantity) {
		this.userDefinedBuyQuantity = userDefinedBuyQuantity;
	}
	public int getWeeksAtRegularPrice() {
		return weeksAtRegularPrice;
	}
	public void setWeeksAtRegularPrice(int weeksAtRegularPrice) {
		this.weeksAtRegularPrice = weeksAtRegularPrice;
	}
	public double getAverageUnitRetailShave() {
		return averageUnitRetailShave;
	}
	public void setAverageUnitRetailShave(double averageUnitRetailShave) {
		this.averageUnitRetailShave = averageUnitRetailShave;
	}
	public double getAveragePerStore() {
		return averagePerStore;
	}
	public void setAveragePerStore(double averagePerStore) {
		this.averagePerStore = averagePerStore;
	}
	public boolean isAveragePerStoreOverridden() {
		return isAveragePerStoreOverridden;
	}
	public void setAveragePerStoreOverridden(boolean isAveragePerStoreOverridden) {
		this.isAveragePerStoreOverridden = isAveragePerStoreOverridden;
	}
	public double getRegularSellThroughPercent() {
		return regularSellThroughPercent;
	}
	public void setRegularSellThroughPercent(double regularSellThroughPercent) {
		this.regularSellThroughPercent = regularSellThroughPercent;
	}
	public String getPlannedInStoreDate() {
		return plannedInStoreDate;
	}
	public void setPlannedInStoreDate(String plannedInStoreDate) {
		this.plannedInStoreDate = plannedInStoreDate;
	}
	public List<MarkdownPercentage> getMarkdownPercentages() {
		return markdownPercentages;
	}
	public void setMarkdownPercentages(List<MarkdownPercentage> markdownPercentages) {
		this.markdownPercentages = markdownPercentages;
	}
	public TicketPrice getTicketPrice() {
		return ticketPrice;
	}
	public void setTicketPrice(TicketPrice ticketPrice) {
		this.ticketPrice = ticketPrice;
	}
	public PlanFinancialFacts getPlanFinancialFacts() {
		return planFinancialFacts;
	}
	public void setPlanFinancialFacts(PlanFinancialFacts planFinancialFacts) {
		this.planFinancialFacts = planFinancialFacts;
	}
	public List<SeasonalityCoefficient> getSeasonalityCoefficients() {
		return seasonalityCoefficients;
	}
	public void setSeasonalityCoefficients(
			List<SeasonalityCoefficient> seasonalityCoefficients) {
		this.seasonalityCoefficients = seasonalityCoefficients;
	}
	public List<Elasticities> getElasticities() {
		return elasticities;
	}
	public void setElasticities(List<Elasticities> elasticities) {
		this.elasticities = elasticities;
	}
	public int getInDistributionCenterToInStoreWindow() {
		return inDistributionCenterToInStoreWindow;
	}
	public void setInDistributionCenterToInStoreWindow(
			int inDistributionCenterToInStoreWindow) {
		this.inDistributionCenterToInStoreWindow = inDistributionCenterToInStoreWindow;
	}
	public SizeProfile getSizeProfile() {
		return sizeProfile;
	}
	public void setSizeProfile(SizeProfile sizeProfile) {
		this.sizeProfile = sizeProfile;
	}
	public SizeRange getSizeRange() {
		return sizeRange;
	}
	public void setSizeRange(SizeRange sizeRange) {
		this.sizeRange = sizeRange;
	}
	public boolean isManuallySized() {
		return isManuallySized;
	}
	public void setManuallySized(boolean isManuallySized) {
		this.isManuallySized = isManuallySized;
	}
	public boolean isAutoSized() {
		return isAutoSized;
	}
	public void setAutoSized(boolean isAutoSized) {
		this.isAutoSized = isAutoSized;
	}
	public StoreDeviations getStoreDeviations() {
		return storeDeviations;
	}
	public void setStoreDeviations(StoreDeviations storeDeviations) {
		this.storeDeviations = storeDeviations;
	}
	public AssortmentStrategy getAssortmentStrategy() {
		return assortmentStrategy;
	}
	public void setAssortmentStrategy(AssortmentStrategy assortmentStrategy) {
		this.assortmentStrategy = assortmentStrategy;
	}
	public RollingDistro getRollingDistro() {
		return rollingDistro;
	}
	public void setRollingDistro(RollingDistro rollingDistro) {
		this.rollingDistro = rollingDistro;
	}
	public String getMarkdownDate() {
		return markdownDate;
	}
	public void setMarkdownDate(String markdownDate) {
		this.markdownDate = markdownDate;
	}
	public List<LocationBasedSeasonalities> getLocationBasedSeasonalities() {
		return locationBasedSeasonalities;
	}
	public void setLocationBasedSeasonalities(
			List<LocationBasedSeasonalities> locationBasedSeasonalities) {
		this.locationBasedSeasonalities = locationBasedSeasonalities;
	}
}
