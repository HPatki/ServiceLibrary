package com.gap.inventory.services.CatalogService.implementation;

import com.gap.inventory.services.CatalogService.intrface.ICatalogService;


public class CatalogServiceFriend {
	
	public static ICatalogService createFriend ()
    {
         return new CatalogServiceImpl();
    }

}