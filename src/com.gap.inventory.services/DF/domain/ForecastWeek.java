package com.gap.inventory.services.DF.domain;

import java.util.List;

/**
 * Created by Hpatki on 8/29/2016.
 */
public class ForecastWeek
{
    private String week;
    private List<Location> locations;

    public String etweek ()
    {
        return week;
    }

    private List<Location> getlocations ()
    {
        return locations;
    }

    public  void setweek (String week)
    {
        this.week = week;
    }

    public void setlocations (List<Location> locations)
    {
        this.locations = locations;
    }
}
