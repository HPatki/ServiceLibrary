package com.gap.inventory.services.DF.domain;

import java.math.BigDecimal;

/**
 * Created by Hpatki on 9/2/2016.
 */
public class Forecast
{
    private static final int PRECISION = 15;
    private static final int EQUAL = 0;

    private BigDecimal forecast;

    public BigDecimal getforecast ()
    {
        return forecast;
    }

    public void setforecast (BigDecimal deci)
    {
        forecast = deci;
    }

}
