package com.gap.inventory.services.DF.intrface;

import com.gap.inventory.services.DF.domain.DemandForecast;

import java.util.List;
import java.util.Map;

/**
 * Created by Hpatki on 8/29/2016.
 */
public interface IDemandForecast
{
    DemandForecast getForecast (Map<String,?> params);
    List<DemandForecast> getForecastCollection (Map<String,?> params);
}
