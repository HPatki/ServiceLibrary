package com.gap.inventory.services.DF.config;

import com.gap.inventory.services.DF.implementation.DemandForecastFriend;
import com.gap.inventory.services.DF.intrface.IDemandForecast;

/**
 * Created by Hpatki on 8/29/2016.
 */
public abstract class DemandForecastFactory
{
    public static IDemandForecast createService ()
    {
        return DemandForecastFriend.createFriend();
    }
}