package com.gap.inventory.domain;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReceiptRecommendationFacts {
	private String receiptsRecommendationStrategy;
	private int maxNumberOfRecommendedReceipts;
	private String receiptsCadenceStrategy;
	private int receiptsCadence;
	private boolean isOpenStockAllowed;
	private List<BuyReceipt> buyReceipts;
	private boolean buyIntoDemandImpacts;
	private int minimumOrderQuantity;
	private int bookedQuantity;
	private String bookingDate;
	private int safetyWeeks;
	private int initialReceiptSafetyWeeks;
	private int weeksAtRegularPriceForOneReceipt;
	private double loadPercentage;
	private int lastReceiptHorizon;
	private boolean isUserReceiptLinkedToRecommendedReceipt;
	private int roundingIncrement;
	private String minimumBuyRoundingStrategy;
	private double receiptNeedRounding;
	private VisualMinimumConfiguration visualMinimumConfiguration;
	public String getReceiptsRecommendationStrategy() {
		return receiptsRecommendationStrategy;
	}
	public void setReceiptsRecommendationStrategy(
			String receiptsRecommendationStrategy) {
		this.receiptsRecommendationStrategy = receiptsRecommendationStrategy;
	}
	public int getMaxNumberOfRecommendedReceipts() {
		return maxNumberOfRecommendedReceipts;
	}
	public void setMaxNumberOfRecommendedReceipts(int maxNumberOfRecommendedReceipts) {
		this.maxNumberOfRecommendedReceipts = maxNumberOfRecommendedReceipts;
	}
	public String getReceiptsCadenceStrategy() {
		return receiptsCadenceStrategy;
	}
	public void setReceiptsCadenceStrategy(String receiptsCadenceStrategy) {
		this.receiptsCadenceStrategy = receiptsCadenceStrategy;
	}
	public int getReceiptsCadence() {
		return receiptsCadence;
	}
	public void setReceiptsCadence(int receiptsCadence) {
		this.receiptsCadence = receiptsCadence;
	}
	public boolean isOpenStockAllowed() {
		return isOpenStockAllowed;
	}
	public void setOpenStockAllowed(boolean isOpenStockAllowed) {
		this.isOpenStockAllowed = isOpenStockAllowed;
	}
	public List<BuyReceipt> getBuyReceipts() {
		return buyReceipts;
	}
	public void setBuyReceipts(List<BuyReceipt> buyReceipts) {
		this.buyReceipts = buyReceipts;
	}
	public boolean isBuyIntoDemandImpacts() {
		return buyIntoDemandImpacts;
	}
	public void setBuyIntoDemandImpacts(boolean buyIntoDemandImpacts) {
		this.buyIntoDemandImpacts = buyIntoDemandImpacts;
	}
	public int getMinimumOrderQuantity() {
		return minimumOrderQuantity;
	}
	public void setMinimumOrderQuantity(int minimumOrderQuantity) {
		this.minimumOrderQuantity = minimumOrderQuantity;
	}
	public int getBookedQuantity() {
		return bookedQuantity;
	}
	public void setBookedQuantity(int bookedQuantity) {
		this.bookedQuantity = bookedQuantity;
	}
	public String getBookingDate() {
		return bookingDate;
	}
	public void setBookingDate(String bookingDate) {
		this.bookingDate = bookingDate;
	}
	public int getSafetyWeeks() {
		return safetyWeeks;
	}
	public void setSafetyWeeks(int safetyWeeks) {
		this.safetyWeeks = safetyWeeks;
	}
	public int getInitialReceiptSafetyWeeks() {
		return initialReceiptSafetyWeeks;
	}
	public void setInitialReceiptSafetyWeeks(int initialReceiptSafetyWeeks) {
		this.initialReceiptSafetyWeeks = initialReceiptSafetyWeeks;
	}
	public int getWeeksAtRegularPriceForOneReceipt() {
		return weeksAtRegularPriceForOneReceipt;
	}
	public void setWeeksAtRegularPriceForOneReceipt(
			int weeksAtRegularPriceForOneReceipt) {
		this.weeksAtRegularPriceForOneReceipt = weeksAtRegularPriceForOneReceipt;
	}
	public double getLoadPercentage() {
		return loadPercentage;
	}
	public void setLoadPercentage(double loadPercentage) {
		this.loadPercentage = loadPercentage;
	}
	public int getLastReceiptHorizon() {
		return lastReceiptHorizon;
	}
	public void setLastReceiptHorizon(int lastReceiptHorizon) {
		this.lastReceiptHorizon = lastReceiptHorizon;
	}
	public boolean isUserReceiptLinkedToRecommendedReceipt() {
		return isUserReceiptLinkedToRecommendedReceipt;
	}
	public void setUserReceiptLinkedToRecommendedReceipt(
			boolean isUserReceiptLinkedToRecommendedReceipt) {
		this.isUserReceiptLinkedToRecommendedReceipt = isUserReceiptLinkedToRecommendedReceipt;
	}
	public int getRoundingIncrement() {
		return roundingIncrement;
	}
	public void setRoundingIncrement(int roundingIncrement) {
		this.roundingIncrement = roundingIncrement;
	}
	public String getMinimumBuyRoundingStrategy() {
		return minimumBuyRoundingStrategy;
	}
	public void setMinimumBuyRoundingStrategy(String minimumBuyRoundingStrategy) {
		this.minimumBuyRoundingStrategy = minimumBuyRoundingStrategy;
	}
	public double getReceiptNeedRounding() {
		return receiptNeedRounding;
	}
	public void setReceiptNeedRounding(double receiptNeedRounding) {
		this.receiptNeedRounding = receiptNeedRounding;
	}
	public VisualMinimumConfiguration getVisualMinimumConfiguration() {
		return visualMinimumConfiguration;
	}
	public void setVisualMinimumConfiguration(
			VisualMinimumConfiguration visualMinimumConfiguration) {
		this.visualMinimumConfiguration = visualMinimumConfiguration;
	}
	
}
