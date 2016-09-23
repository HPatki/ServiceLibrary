package com.gap.inventory.services.CatalogService.intrface;

import java.util.*;

import com.gap.inventory.services.CatalogService.domain.CatalogCC;

public interface ICatalogService {

	public CatalogCC getCCInfo(Map<String,String> input);
	public List<CatalogCC> getCCInfoCollection(List<Map<String,String>> input);
}
