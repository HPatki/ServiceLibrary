package com.gap.inventory.services.DF.implementation;

import com.gap.inventory.services.DF.domain.DemandForecast;
import com.gap.inventory.services.DF.intrface.IDemandForecast;
import com.gap.inventory.services.common.ApplicationContextUtil;

/**
 * Created by Hpatki on 8/29/2016.
 */
class DemandForecastImpl implements IDemandForecast
{
    public DemandForecastImpl ()
    {

    }

    @Override
    public DemandForecast getForecast (String ccNbr)
    {
        ApplicationContextUtil.getProperty ("ccforecast");
           return null;
    }
}
