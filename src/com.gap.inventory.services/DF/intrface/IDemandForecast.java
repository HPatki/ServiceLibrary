package com.gap.inventory.services.DF.intrface;

import com.gap.inventory.services.DF.domain.DemandForecast;

/**
 * Created by Hpatki on 8/29/2016.
 */
public interface IDemandForecast
{
    DemandForecast getForecast (String ccNbr);
}
