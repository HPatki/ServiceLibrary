package com.gap.inventory.services.DF.domain;

import java.util.List;

/**
 * Created by Hpatki on 8/26/2016.
 */
public class DemandForecast
{
    private String customerChoice;
    private long brandId;
    private long marketId;
    private long channelId;
    private List<ForecastWeek> weeks;

    public String getcustomerChoice ()
    {
        return customerChoice;
    }

    public String getCustomerChoice() {
		return customerChoice;
	}

	public long getBrandId() {
		return brandId;
	}

	public long getMarketId() {
		return marketId;
	}

	public long getChannelId() {
		return channelId;
	}

	public List<ForecastWeek> getWeeks() {
		return weeks;
	}

    public void setcustomerChoice (String pln_prd_nbr)
    {
        this.customerChoice = pln_prd_nbr;
    }

    public void setweeks (List<ForecastWeek> weeks)
    {
        this.weeks = weeks;
    }

    public void setbrandId (long brndId)
    {
       brandId = brndId;
    }

    public void setmarketId (long mktId)
    {
        marketId = mktId;
    }

    public void setchannelId (long chnlId)
    {
        channelId = chnlId;
    }

    public long getbrandId ()
    {
        return brandId;
    }

    public long getmarketId ()
    {
        return marketId;
    }

    public long getchannelId ()
    {
        return channelId;
    }
}
