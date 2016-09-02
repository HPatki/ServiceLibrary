package com.gap.inventory.services.CatalogService.config;

import com.gap.inventory.services.CatalogService.implementation.CatalogServiceFriend;
import com.gap.inventory.services.CatalogService.intrface.ICatalogService;
import com.gap.inventory.services.common.ApplicationContextUtil;

public class CatalogServiceFactory {
	private static boolean appContextCreated = false;
    private static Object lock = new Object();

    public static ICatalogService createService ()
    {
    	ICatalogService inst = null;

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
            inst = CatalogServiceFriend.createFriend();

        return inst;
    }
}