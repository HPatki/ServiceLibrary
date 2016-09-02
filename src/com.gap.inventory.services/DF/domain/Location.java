package com.gap.inventory.services.DF.domain;

/**
 * Created by Hpatki on 8/29/2016.
 */
public class Location
{
    private String id;
    private Forecast baseForecast;
    private Forecast promotedForecast;

    public String getid ()
    {
        return id;
    }

    public void setid (String id)
    {
        this.id = id;
    }

    public Forecast getbaseForecast ()
    {
        return baseForecast;
    }

    public void setbaseForecast (Forecast baseForecast)
    {
        this.baseForecast = baseForecast;
    }

    public Forecast getpromotedForecast ()
    {
        return promotedForecast;
    }

    public void setpromotedForecast (Forecast promotedForecast)
    {
        this.promotedForecast = promotedForecast;
    }
}
