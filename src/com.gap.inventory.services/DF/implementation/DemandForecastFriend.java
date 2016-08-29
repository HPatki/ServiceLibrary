package com.gap.inventory.services.DF.implementation;

import com.gap.inventory.services.DF.intrface.IDemandForecast;

/**
 * Created by Hpatki on 8/29/2016.
 */
public class DemandForecastFriend
{
      public static IDemandForecast createFriend ()
      {
           return new DemandForecastImpl();
      }
}
