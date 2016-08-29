package com.gap.inventory.services.DF.config;

import com.gap.inventory.services.DF.implementation.DemandForecastFriend;
import com.gap.inventory.services.DF.intrface.IDemandForecast;
import com.gap.inventory.services.common.ApplicationContextUtil;

/**
 * Created by Hpatki on 8/29/2016.
 */
public final class DemandForecastFactory
{
    private static boolean appContextCreated = false;
    private static Object lock;

    public static IDemandForecast createService ()
    {
        IDemandForecast inst = null;

        synchronized (lock)
        {
            if (false == appContextCreated)
            {
                try
                {
                    ApplicationContextUtil.initializeApplicationContext();
                    appContextCreated = true;
                }
                catch (Exception err)
                {
                    appContextCreated = false;
                }

            }

        }

        if (false != appContextCreated)
            inst = DemandForecastFriend.createFriend();

        return inst;
    }
}