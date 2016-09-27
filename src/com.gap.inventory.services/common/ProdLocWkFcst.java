package com.gap.inventory.services.common;

public class ProdLocWkFcst {
	private Integer pln_prd_nbr;
	private Integer dcNbr;
	private Integer str_Nbr;
	private Integer lastModifiedDate;
	private int fis_yr_nbr;
	private int fis_wk_nbr;
	private double forecast;
	private double constrainedForcast;
	private double modelStock;
	
	public ProdLocWkFcst(int pln_prd_nbr, int dcNbr, int str_Nbr,
			int fis_yr_nbr, int fis_wk_nbr, double forecast,
			double constrainedForcast, double modelStock) {
		
		this.pln_prd_nbr = pln_prd_nbr;
		this.dcNbr = dcNbr;
		this.str_Nbr = str_Nbr;
		this.fis_yr_nbr = fis_yr_nbr;
		this.fis_wk_nbr = fis_wk_nbr;
		this.forecast = forecast;
		this.constrainedForcast = constrainedForcast;
		this.modelStock = modelStock;
	}

	public Integer getPln_prd_nbr() {
		return pln_prd_nbr;
	}

	public void setPln_prd_nbr(Integer pln_prd_nbr) {
		this.pln_prd_nbr = pln_prd_nbr;
	}

	public Integer getDcNbr() {
		return dcNbr;
	}

	public void setDcNbr(Integer dcNbr) {
		this.dcNbr = dcNbr;
	}

	public Integer getStr_Nbr() {
		return str_Nbr;
	}

	public void setStr_Nbr(Integer str_Nbr) {
		this.str_Nbr = str_Nbr;
	}

	public Integer getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Integer lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public int getFis_yr_nbr() {
		return fis_yr_nbr;
	}

	public void setFis_yr_nbr(int fis_yr_nbr) {
		this.fis_yr_nbr = fis_yr_nbr;
	}

	public int getFis_wk_nbr() {
		return fis_wk_nbr;
	}

	public void setFis_wk_nbr(int fis_wk_nbr) {
		this.fis_wk_nbr = fis_wk_nbr;
	}

	public double getForecast() {
		return forecast;
	}

	public void setForecast(double forecast) {
		this.forecast = forecast;
	}

	public double getConstrainedForcast() {
		return constrainedForcast;
	}

	public void setConstrainedForcast(double constrainedForcast) {
		this.constrainedForcast = constrainedForcast;
	}

	public double getModelStock() {
		return modelStock;
	}

	public void setModelStock(double modelStock) {
		this.modelStock = modelStock;
	}
	         
}
