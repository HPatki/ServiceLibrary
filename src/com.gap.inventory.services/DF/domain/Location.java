package com.gap.inventory.services.DF.domain;

/**
 * Created by Hpatki on 8/29/2016.
 */
public class Location
{
    private String id;
    private double baseForecast;

    public String getid ()
    {
        return id;
    }

    public double getbaseForecast ()
    {
        return baseForecast;
    }

    public void setid (String id)
    {
        this.id = id;
    }

    public void setbaseForecast (double baseForecast)
    {
        this.baseForecast = baseForecast;
    }
}
