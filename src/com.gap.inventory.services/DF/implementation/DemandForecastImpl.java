package com.gap.inventory.services.DF.implementation;

import com.gap.inventory.services.DF.domain.DemandForecast;
import com.gap.inventory.services.DF.intrface.IDemandForecast;
import com.gap.inventory.services.common.ApplicationContextUtil;
import com.gap.inventory.services.common.RestService;

import java.util.List;
import java.util.Map;

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
    public DemandForecast getForecast (Map<String,?> params)
    {
        String rSource = ApplicationContextUtil.getProperty ("ccforecast");
        return endPoint.getObjectUsingGetMethod(rSource,DemandForecast.class, params);
    }

    @Override
    public List<DemandForecast> getForecastCollection (Map<String,?> params)
    {
        String rSource = ApplicationContextUtil.getProperty ("ccforecast1");
        return endPoint.getCollectionUsingGetMethod(rSource,DemandForecast.class,params);
    }
}
