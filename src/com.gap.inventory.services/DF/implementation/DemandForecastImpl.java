package com.gap.inventory.services.DF.implementation;

import com.gap.inventory.services.DF.domain.DemandForecast;
import com.gap.inventory.services.DF.intrface.IDemandForecast;
import com.gap.inventory.services.common.ApplicationContextUtil;
import com.gap.inventory.services.common.RestService;

/**
 * Created by Hpatki on 8/29/2016.
 */
class DemandForecastImpl implements IDemandForecast
{
    private RestService endPoint;

    public DemandForecastImpl ()
    {
        String baseURL = ApplicationContextUtil.getProperty ("baseurl");
        endPoint = new RestService(baseURL);
    }

    @Override
    public DemandForecast getForecast (String ccNbr)
    {
        String rSource = ApplicationContextUtil.getProperty ("ccforecast");
        //endPoint.getObjectUsingGetMethod(rSource,);
        return null;
    }
}
