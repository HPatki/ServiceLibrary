package com.gap.inventory.services.DF.domain;

import java.util.List;

/**
 * Created by Hpatki on 8/26/2016.
 */
public class DemandForecast
{
    private String pln_prd_nbr;
    private List<ForecastWeek> weeks;

    public String getPln_prd_nbr ()
    {
        return pln_prd_nbr;
    }

    public void setPln_prd_nbr (String pln_prd_nbr)
    {
        this.pln_prd_nbr = pln_prd_nbr;
    }

    public void setweeks (List<ForecastWeek> weeks)
    {
        this.weeks = weeks;
    }
}
